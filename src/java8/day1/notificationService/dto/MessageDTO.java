package java8.day1.notificationService.dto;

import java.io.Serializable;

public class MessageDTO implements Serializable {
    private String type;
    private String payload;

    public MessageDTO(String type, String payload) {
        this.type = type;
        this.payload = payload;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "type='" + type + '\'' +
                ", payload='" + payload + '\'' +
                '}';
    }
}
