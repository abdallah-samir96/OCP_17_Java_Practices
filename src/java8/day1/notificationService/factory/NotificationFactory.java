package java8.day1.notificationService.factory;

import java8.day1.notificationService.Notification;
import java8.day1.notificationService.dto.NotificationType;
import java8.day1.notificationService.impl.EmailNotification;
import java8.day1.notificationService.impl.SMSNotification;

public class NotificationFactory {
    public static Notification getNotificationService(NotificationType type) {
        switch (type) {
            case SMS -> {
                return new SMSNotification();
            }
            case EMAIL -> {
                return new EmailNotification();
            }
        }
        throw new RuntimeException("Type " + type + " not Exists!!");
    }
}
