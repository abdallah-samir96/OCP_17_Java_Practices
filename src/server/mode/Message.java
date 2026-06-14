package server.mode;

import java.io.Serializable;
import java.time.LocalDateTime;

public record Message(String type, String title, LocalDateTime dateTime) implements Serializable {
}
