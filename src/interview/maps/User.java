package interview.maps;

import java.util.Objects;

class User {
    String email;

    public User(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User user) {
            return Objects.equals(email, user.email);
        }
        return false;

    }
    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
