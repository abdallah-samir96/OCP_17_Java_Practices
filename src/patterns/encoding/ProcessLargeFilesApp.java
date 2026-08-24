package patterns.encoding;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ProcessLargeFilesApp {
    private static final String SOURCE_PATH = "large_file.app";
    private static final String TARGET_PATH = "target_large_file.app";
    private static final short BUFFER_SIZE = 1024;
    public static void main(String[] args) throws IOException {

        var sourcePath = Path.of(SOURCE_PATH);
        var targetPath = Path.of(TARGET_PATH);

        if (Files.notExists(targetPath)) {
            System.out.println("Trying to create the File!!");
            Files.createFile(targetPath);
        }

        byte[] buffer = new byte[BUFFER_SIZE];
        try (
                var is = new BufferedInputStream(new FileInputStream(sourcePath.toFile()));
                var os = new BufferedOutputStream(new FileOutputStream(targetPath.toFile()))
        ) {
            var iteration = 1;
            int readBytes;
            while ((readBytes = is.read(buffer)) != -1) {
                System.out.printf("Writing Chunk %d %n", iteration++);
                // to write only the target buffer data
                os.write(buffer, 0, readBytes);
            }
        }
        System.out.println("Writing Into the file has been finished!!!!!");
    }
}
