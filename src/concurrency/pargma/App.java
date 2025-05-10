package concurrency.pargma;

import java.time.Duration;
import java.time.Instant;

public class App {

    private static int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        var startTime = Instant.now();
        System.out.println("Starting time is " + startTime);
        var fib = fibonacci(42);
        System.out.println("The fibonacci Is : " + fib);
        System.out.println("done in " + Duration.between(startTime, Instant.now()).toMillis());


    }


}
