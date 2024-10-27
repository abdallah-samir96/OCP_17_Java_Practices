package java8.day1.notificationService;

import java8.day1.notificationService.dto.MessageDTO;

public interface Notification {
    void send(MessageDTO payload);
}
