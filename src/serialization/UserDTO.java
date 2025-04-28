package serialization;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private final String name;
    private final String email;
    private final transient String ssn;

    public UserDTO(String name, String email, String ssn) {
        this.name = name;
        this.email = email;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
