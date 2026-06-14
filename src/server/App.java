package server;

import server.impl.MessageServiceImpl;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.time.Instant;

public class App {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {

        // This is RMI method invocation
        var service = new MessageServiceImpl();
        var registry = LocateRegistry.createRegistry(1000);
        registry.rebind("message_service", service);
        System.out.println("Server is running now");
        while(true) {
            System.out.println("Time Is: " + Instant.now());
            Thread.sleep(3000);
        }

    }
}
