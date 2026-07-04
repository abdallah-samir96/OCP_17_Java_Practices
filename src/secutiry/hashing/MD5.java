package secutiry.hashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HexFormat;

public class MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        // 128-bit fingerprint, 16 Byte = 32 Character
        // The hash is only 16 hexadecimal
        var plainMessage = "Hello";
        var algorithm = MessageDigest.getInstance("md5");
        var digestData = algorithm.digest(plainMessage.getBytes());
        var formattedHex = HexFormat.of().formatHex(digestData);
        System.out.printf("The hash of \"%s\" is %s", plainMessage, formattedHex);
    }
}
