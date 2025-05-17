package concurrency.pargma.time;

import java.time.*;

public class APp {
    public static void main(String[] args) {
        datetime();

    }

    static void datetime() {
        // string datetime without timezone
        // Epoc time from 1-jan-1970

        System.out.println(Clock.systemUTC());
        System.out.println(Clock.systemDefaultZone());
        System.out.println(LocalDateTime.now(Clock.systemUTC()));
        System.out.println(Instant.now());
        System.out.println(Instant.now().getEpochSecond());
        System.out.println(LocalDateTime.now(Clock.systemUTC()).toEpochSecond(ZoneOffset.UTC));

        System.out.println("Date time without time zon");
        System.out.println(Instant.now());
        System.out.println(LocalDateTime.now(Clock.systemUTC()));
        System.out.println("Zoned Datetime");
        System.out.println(ZonedDateTime.now());

    }

}
