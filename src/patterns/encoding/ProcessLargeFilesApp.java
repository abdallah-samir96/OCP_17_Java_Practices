package patterns.encoding;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ProcessLargeFilesApp {
    public static void main(String[] args) throws IOException {

        var filePath = Path.of("large_file.app");
        var targetFilePath = Path.of("target_large_file.app");
        if (Files.notExists(targetFilePath)) {
            System.out.println("Trying to create the File!!");
            Files.createFile(targetFilePath);
        }

        byte[] buffer = new byte[1024]; // 1KB
        try (
                var is = new BufferedInputStream(new FileInputStream(filePath.toFile()));
                var os = new BufferedOutputStream(new FileOutputStream(targetFilePath.toFile()))
        ) {
            var iteration = 1;
            int readBytes;
            while ((readBytes = is.read(buffer)) != -1) {
                System.out.printf("Writing Chunk %d %n", iteration++);
                // to write only the target buffer data
                os.write(buffer, 0, readBytes);
            }
        }
    }
}
