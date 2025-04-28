package serialization;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {

    private static final String filePath = "local" + File.separator + "stream-bytes.txt";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        var path = Path.of(filePath);
        if(!Files.exists(path)) {
            Files.createFile(path);
        }


        var userDto = new UserDTO("A", "a@a.com", "123456");

        try(var objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))){
            objectOutputStream.writeObject(userDto);
            System.out.println("object has been written into the file!");
        }




        try(var objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))){
           // reading object stream from file
            System.out.println("Reading Object from file in path : " + path);
            var dto = (UserDTO)objectInputStream.readObject();
            System.out.println(dto);
        }


    }
}
