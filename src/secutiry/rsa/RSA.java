package secutiry.rsa;

import java.nio.charset.StandardCharsets;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.logging.Logger;

public class RSA {

    private final PublicKey publicKey;
    private final PrivateKey privateKey;
    private final static String RSA_ALGORITHM = "RSA";

    private final static Logger logger = Logger.getLogger(RSA.class.getName());

    public RSA() throws NoSuchAlgorithmException {
        System.out.println("Starting generating private & public keys!!");
        var rsa = KeyPairGenerator.getInstance(RSA_ALGORITHM);
        System.out.println("Used Algorithm is: " + rsa.getAlgorithm());
        rsa.initialize(1024);
        var keyPair = rsa.generateKeyPair();
        this.privateKey = keyPair.getPrivate();
        this.publicKey = keyPair.getPublic();
    }
    public void printKeys() {
        System.out.println("Private Key");
        var encodedPrivateKey = privateKey.getEncoded();
        var encodedPublicKey = publicKey.getEncoded();
        System.out.println("Public:" + Base64.getEncoder().encodeToString(encodedPublicKey));
        System.out.println("Private:" + Base64.getEncoder().encodeToString(encodedPrivateKey));

    }
}
