package serialization;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {

    private static final String filePath = "local" + File.separator + "conf.txt";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        var path = Path.of(filePath);
        if(!Files.exists(path)) {
            Files.createFile(path);
        }


        var userDto = new UserDTO("A", "a@a.com", "12345");

        try(var objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))){
            objectOutputStream.writeObject(userDto);
        }

        try(var objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))){
            var dto = (UserDTO)objectInputStream.readObject();
            System.out.println(dto);
        }


    }
}
