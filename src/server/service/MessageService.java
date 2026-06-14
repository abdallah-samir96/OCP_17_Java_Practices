package server.service;

import server.mode.Message;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;
public interface MessageService extends Remote {

    boolean send(Message message) throws RemoteException;

    List<Message> getAll() throws RemoteException;
}
