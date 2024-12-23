package concurrency;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {


    public static void main(String[] args) throws InterruptedException {

        System.out.println(Runtime.getRuntime().availableProcessors());


    }















    private static void blockingQueues(){

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        new Thread(()->{
            try {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Adding : " + i);
                    queue.put(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(()-> {
            while (true) {
                if(!queue.isEmpty()) {
                    try {
                        System.out.println("\t\t\t removing " + queue.take());
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
    private static void printProperties() {
        System.out.println("Environment Properties!");
        System.getProperties().forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
