package patterns.encoding;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws IOException {
        var bytes = Files.readAllBytes(Path.of("app.config"));
        var encodedText  = Base64.getEncoder().encodeToString(bytes);
        var decodedBytes = Base64.getDecoder().decode(encodedText);
        new FileOutputStream("abdallah.config").write(decodedBytes);
        System.out.println(encodedText);
        System.out.println(Arrays.toString(decodedBytes));
//        System.out.println(Arrays.toString(bytes));
    }
}
