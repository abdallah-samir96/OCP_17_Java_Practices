package patterns;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class MainApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A("Abdallah", LocalDateTime.now(), 1000, new StringBuilder("Hello"));
        A b = (A)a.clone();
        b.setName("Ahmed");
        b.test.x = 10000;
        b.setStringBuilder(new StringBuilder("World"));
        a.setStringBuilder(new StringBuilder("DDD"));
        System.out.println(a);
        System.out.println(b);

        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("***********************");
        var builder = new Builder()
                .name("abdallah")
                .build();
        System.out.println(builder);


    }
}
