package saga.services;

import java.util.ArrayList;
import java.util.List;

public class SagaExecutor {


    public static void execute(List<SagaStep> steps) {
        List<SagaStep> completed = new ArrayList<>();
        for(var step: steps) {
            if(!step.execute()) {
                // compensating all operation in reversed way
                System.out.println("Trying to Compensate !!!!");
                for (int i = completed.size() - 1; i >= 0; i--) {
                    completed.get(i).compensate();
                }
                System.out.println("Failed to Handle The whole Requests!!!");
                return;
            }

            completed.add(step);
        }
        System.out.println("The whole Requests Has Been Processed!!!!");
    }
}
