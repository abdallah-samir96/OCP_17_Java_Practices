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
}

record User(String name, String email) {
    
}