package saga.services.impl;

import saga.services.SagaStep;

public class OrderService implements SagaStep {

    private final boolean isSucceeded;

    public OrderService(boolean succeeded) {
        this.isSucceeded = succeeded;
    }
    @Override
    public boolean execute() {
        if(isSucceeded) {
            System.out.println("Order Booked!!");
            return true;
        }
        System.out.println("Order is Failed!!");
        return false;
    }

    @Override
    public void compensate() {
        System.out.println("Trying to cancel the order!!!!");
    }
}
