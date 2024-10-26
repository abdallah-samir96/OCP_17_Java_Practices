package java8.day1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.UTC));
        System.out.println(Instant.now());


    }
}
