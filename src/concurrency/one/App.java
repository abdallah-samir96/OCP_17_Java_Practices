package concurrency.one;

import java.util.concurrent.ExecutionException;

public class App {
    static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(()-> 0);
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        var startTime = System.currentTimeMillis();


    }

}

