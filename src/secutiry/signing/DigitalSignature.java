package secutiry.signing;

import java.security.*;
import java.time.Duration;
import java.time.Instant;
import java.util.HexFormat;

public class DigitalSignature {

    private static PrivateKey privateKey;
    private static PublicKey publicKey;
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

    public static String sign(byte [] data) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature signature = Signature.getInstance("SHA256WithRSA");
        signature.initSign(privateKey);
        signature.update(data);
        var digitalSignature = signature.sign();
        return HexFormat.of().formatHex(digitalSignature);
    }

    public static boolean verify(byte [] message, String dSignature) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature verifier = Signature.getInstance("SHA256WithRSA");
        verifier.initVerify(publicKey);
        verifier.update(message);
        var signature = HexFormat.of().parseHex(dSignature);
        return verifier.verify(signature);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {

        var startTime = Instant.now();
        var message = "Hello Abdallah, how are you";
        var digitalSignature = sign(message.getBytes());
        System.out.printf("Digital Signature of %s is %s\n", message, digitalSignature);
        var isVerified = verify(message.getBytes(), digitalSignature);
        System.out.println("is the digital signature valid : " + isVerified);
        var endTime = Instant.now();
        System.out.println(Duration.between(startTime, endTime).toMillis());
    }




}
