package patterns;

import java.time.LocalDateTime;

public class MainApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        A.Test test = new A.Test(3, 4);
        A a = new A(test, "Abdallah", LocalDateTime.now(), 1000, new StringBuilder("Hello"));
        A b = (A)a.clone();
        b.setName("Ahmed");
        b.setStringBuilder(new StringBuilder("World"));
        a.setStringBuilder(new StringBuilder("DDD"));
        b.test.x = 1000;
        System.out.println(a);
        System.out.println(b);
    }
}
