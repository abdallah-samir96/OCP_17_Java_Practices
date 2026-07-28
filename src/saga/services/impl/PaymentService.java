package saga.services.impl;

import saga.services.SagaStep;

public class PaymentService implements SagaStep {
    private final boolean isSucceeded;

    public PaymentService(boolean succeeded) {
        this.isSucceeded = succeeded;
    }
    @Override
    public boolean execute() {
        if(isSucceeded) {
            System.out.println("Payment Done!!");
            return true;
        }
        System.out.println("Payment Failed!!");
        return false;
    }

    /**
     * This is not real scenario, as the Compensate itself may fail.
     * */
    @Override
    public void compensate() {
        System.out.println("Trying to Compensate Payments");
    }
}
