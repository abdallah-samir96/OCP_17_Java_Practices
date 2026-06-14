package server.service;

import server.mode.Message;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;
public interface MessageService extends Remote {

    boolean send(Message message) throws RemoteException;

    List<Message> getAll() throws RemoteException;

    boolean send(String fileName, byte[] file) throws IOException;
}
