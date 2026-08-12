package patterns.encoding;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Base64;

public class App {
    public static void main(String[] args) throws IOException {

        var bytes = Files.readAllBytes(Path.of("app.config"));
        var encodedText  = Base64.getEncoder().encodeToString(bytes);
        var decodedBytes = Base64.getDecoder().decode(encodedText);
        try(var os = new FileOutputStream("application.config")){
            os.write(bytes);
        }
        System.out.println(encodedText);
        System.out.println(Arrays.toString(decodedBytes));
    }
}
