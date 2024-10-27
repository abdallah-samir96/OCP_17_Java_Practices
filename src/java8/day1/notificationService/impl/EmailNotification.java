package java8.day1.notificationService.impl;

import java8.day1.notificationService.Notification;
import java8.day1.notificationService.dto.MessageDTO;

public class EmailNotification implements Notification {

    @Override
    public void send(MessageDTO payload) {
        System.out.println(this.getClass().getName() + payload);
    }
}
