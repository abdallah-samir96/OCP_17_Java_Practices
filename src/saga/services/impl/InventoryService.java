package saga.services.impl;

import saga.services.SagaStep;

public class InventoryService implements SagaStep {
    private final boolean isSucceeded;

    public InventoryService(boolean succeeded) {
        this.isSucceeded = succeeded;
    }
    @Override
    public boolean execute() {
        if(isSucceeded) {
            System.out.println("Inventory Update Done!!");
            return true;
        }
        System.out.println("Inventory Update Failed!!");
        return false;
    }

    @Override
    public void compensate() {
        System.out.println("Compensating the product again into the inventory!!!");
    }
}
