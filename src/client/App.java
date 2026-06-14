package client;

import server.mode.Message;
import server.service.MessageService;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws IOException, NotBoundException {
        System.out.println("Starting to lookup the service");
        var fileData = "IMAGE1, 2, 3, 4".getBytes();
        var registry = LocateRegistry.getRegistry(1000);
        var service = registry.lookup("message_service");

        if(service instanceof MessageService messageService){

            messageService.send(new Message("Email", "Hello", LocalDateTime.now()));
            messageService.send("image1.png", fileData);
            var messages = messageService.getAll();
            messages.forEach(System.out::println);
        }
    }
}
