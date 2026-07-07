package secutiry.jwt;

import java.security.*;
import java.util.Base64;
import java.util.Map;

public class JwtGenerator {

    private static final PrivateKey privateKey;
    private static final PublicKey publicKey;
    private final static int KEY_SIZE = 2048;
    private final static String SIGNING_ALGORITHM = "SHA256WITHRSA";

    static {

        try {
            var keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(KEY_SIZE);
            var keyPair = keyPairGenerator.generateKeyPair();
            privateKey = keyPair.getPrivate();
            publicKey = keyPair.getPublic();
            String encoded = Base64.getEncoder().encodeToString(publicKey.getEncoded());

            // generating the public key in .pem file format
            var info = "-----BEGIN PUBLIC KEY-----\n"
                    + encoded
                    + "\n-----END PUBLIC KEY-----";
            System.out.println(info);

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

    public static String generate(Map<String, Object> claims) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        String header = "{\"alg\":\"RS256\",\"typ\":\"JWT\"}";

        var payload  = JsonUtil.toJson(claims);
        var signatureService = Signature.getInstance(SIGNING_ALGORITHM);
        var headerPayloadEncoding = JwtEncoder.base64UrlEncode(header.getBytes()) + "." + JwtEncoder.base64UrlEncode(payload.getBytes());
        signatureService.initSign(privateKey);
        signatureService.update(headerPayloadEncoding.getBytes());
        var signatureInBytes = signatureService.sign();
        var signature = JwtEncoder.base64UrlEncode(signatureInBytes);
        return headerPayloadEncoding + "." + signature;
    }
    public static boolean verify(String jwt) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        var signatureService = Signature.getInstance(SIGNING_ALGORITHM);
        signatureService.initVerify(publicKey);

        var jwtParties  = jwt.split("\\.");
        if(jwtParties.length != 3) {
            return false;
        }
        var headerPayload = jwtParties[0]  + "." + jwtParties[1];
        var signature = JwtEncoder.base64UrlDecode(jwtParties[2]);
        signatureService.update(headerPayload.getBytes());
        return signatureService.verify(signature);
    }
}
