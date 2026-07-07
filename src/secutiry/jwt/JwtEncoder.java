package secutiry.jwt;

import java.util.Base64;

public class JwtEncoder {

    private final static Base64.Encoder  URL_ENCODER = Base64.getUrlEncoder().withoutPadding();
    private static final Base64.Decoder URL_DECODER = Base64.getUrlDecoder();


    public static String base64UrlEncode(byte[] bytes) {
        return URL_ENCODER.encodeToString(bytes);
    }

    public static byte[] base64UrlDecode(String value) {
        return URL_DECODER.decode(value);
    }


}
