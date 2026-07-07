package secutiry.jwt;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

public class App {

    static void main() throws NoSuchAlgorithmException {

        JwtGenerator.generate(Map.of("name", "abdallah"));
    }
}
