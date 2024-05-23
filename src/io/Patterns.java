package io;

import io.patterns.UserBuilder;

public class Patterns {
    public static void main(String[] args) {
        var userInfo = new UserBuilder.Builder()
                .name("Ahmed")
                .email("abdallahsameer22@gmail.com")
                .phone("01097456260")
                .build();

        System.out.println(userInfo);
    }
}
