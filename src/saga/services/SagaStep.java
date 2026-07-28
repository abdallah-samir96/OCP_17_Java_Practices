package saga.services;

public interface SagaStep {
    boolean execute();
    void compensate();
}