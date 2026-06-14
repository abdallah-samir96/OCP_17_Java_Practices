package client;

import server.mode.Message;
import server.service.MessageService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        System.out.println("Starting to lookup the service");
        var registry = LocateRegistry.getRegistry(1000);
        var service = registry.lookup("message_service");

        if(service instanceof MessageService messageService){

            var isSent = messageService.send(new Message("Email", "Hello", LocalDateTime.now()));
            System.out.println("Is the message Sent: " + isSent);
            var messages = messageService.getAll();

            messages.forEach(System.out::println);
        }
    }
}
