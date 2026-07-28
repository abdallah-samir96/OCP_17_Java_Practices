package saga;

import saga.services.SagaExecutor;
import saga.services.impl.InventoryService;
import saga.services.impl.OrderService;
import saga.services.impl.PaymentService;

import java.util.List;

public class App {
    public static void main(String[] args) {

        /**
         *
         * This is just simulation of the saga pattern, not real impl
         * the compensating part may fail also, so we need broker  & Log to handle and keep track of the changes
         * */

        var successServices = List.of(
                new OrderService(true),
                new InventoryService(true),
                new PaymentService(true)
        );

        var executor = new SagaExecutor();
        executor.execute(successServices);
        System.out.println("***************************************");

        var failedServices = List.of(
                new OrderService(true),
                new InventoryService(true),
                new PaymentService(false)
        );

        executor.execute(failedServices);

    }
}
