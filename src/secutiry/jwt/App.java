package secutiry.jwt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Map;

public class App {

    static void main() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {

        Map<String, Object> claims = Map.ofEntries(
                Map.entry("name", "Abdallah"),
                Map.entry("age", 30),
                Map.entry("username", "abc"),
                Map.entry("email", "abdallah@gmail.com")
        );

        // generating token using SHA256RSA
        var jwt = JwtGenerator.generate(claims);
        System.out.println(jwt);
        System.out.println(JwtGenerator.verify(jwt));

    }
}
