package io.patterns;


import java.time.LocalDate;

public class UserBuilder {
    private final String name;
    private final String email;
    private final LocalDate dateOfBirth;
    private final String phone;

    private UserBuilder(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.dateOfBirth = builder.dateOfBirth;
        this.phone = builder.phone;
    }

    public static class Builder {
        private String name;
        private String email;
        private LocalDate dateOfBirth;
        private String phone;

        public Builder() {
        }

        public Builder(String name) {
            this.name = name;
        }

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder build() {
            return new UserBuilder(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone='" + phone + '\'' +
                '}';
    }
}
