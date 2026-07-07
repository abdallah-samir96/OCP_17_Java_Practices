package secutiry.jwt;

import java.security.*;
import java.util.Map;

public class JwtGenerator {

    private static final PrivateKey privateKey;
    private static final PublicKey publicKey;
    private final static int KEY_SIZE = 1024;

    static {

        try {
            var keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(KEY_SIZE);
            var keyPair = keyPairGenerator.generateKeyPair();
            privateKey = keyPair.getPrivate();
            publicKey = keyPair.getPublic();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

    public static String generate(Map<String, Object> claims) throws NoSuchAlgorithmException {
        String header = """
        {
          "alg":"RS256",
          "typ":"JWT"
        }
        """;

        var payload  = JsonUtil.toJson(claims);
        var signature  = Signature.getInstance("SHA256WITHRSA");
        return null;


    }
}
