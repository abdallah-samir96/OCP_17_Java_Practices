package io.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

public class App {
    public static void main(String[] args) throws IOException {


        var directories = Path.of("configuration" + File.separator + uuid() + File.separator + uuid());
        Files.createDirectories(directories);

    }

    private static String uuid(){
        return UUID.randomUUID().toString();
    }
}
