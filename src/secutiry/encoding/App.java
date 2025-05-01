package secutiry.encoding;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class App {
    private final static Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        urlEncodeDecode();
    }

    private static void urlEncodeDecode() {
        var encodedURL = EncodingDecodingUtil.INSTANCE.encode("https://localhost:990/www.domain.com?name=abd");
        logger.info("encoded url=" + encodedURL);
        String decodedUrl = URLDecoder.decode(encodedURL, StandardCharsets.UTF_8);
        logger.info("decoded url=" + decodedUrl);
    }
}
