package java8.day1;

import java8.day1.notificationService.dto.MessageDTO;
import java8.day1.notificationService.dto.NotificationType;
import java8.day1.notificationService.factory.NotificationFactory;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.UTC));
        System.out.println(Instant.now());

//
        var notificationService = NotificationFactory.getNotificationService(NotificationType.EMAIL);
        notificationService.send(new MessageDTO("email", "hello from jms"));
    }
}
