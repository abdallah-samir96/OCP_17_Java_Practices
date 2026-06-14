package concurrency.future;

import java.util.concurrent.CompletableFuture;

public class App {
    
    public static void main(String[] args) {
        var runnable = new Runnable() {
           @Override
           public void run(){
             process();
           }
        };
        runnable.run();
    }

    private static void process() {

        var user = new User("Abdallah0", "abdallah@gmail.com");
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> user)
        .thenApply(user1 -> "Hello " + user1.name())
        .thenApply(String::toUpperCase);

        System.out.println(future.join());
        System.out.println("After joining the future!!");
    }


    private void handle(){



        //
         CompletableFuture<String> userFuture =
                CompletableFuture.supplyAsync(() -> getUser());

        CompletableFuture<String> ordersFuture =
                CompletableFuture.supplyAsync(() -> getOrders());

        CompletableFuture<String> result =
                userFuture.thenCombine(ordersFuture,
                        (user, orders) -> user + "\n" + orders);

        System.out.println(result.join());
           
    }


     static String getUser() {
        sleep(2000);
        return "User: Abdallah";
    }

    static String getOrders() {
        sleep(1500);
        return "Orders: Laptop, Mouse";
    }

    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

record User(String name, String email) {
    
}