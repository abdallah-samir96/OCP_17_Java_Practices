package client.impl;

import client.service.ChatClient;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ChatClientImpl extends UnicastRemoteObject implements ChatClient  {

    private final String username;

    public ChatClientImpl(String username) throws RemoteException {
        this.username = username;
    }

    @Override
    public void receiveMessage(String from, String message) throws RemoteException {
        System.out.println("Receiving Message: " + message + "from : " + from);
    }

    public String getUserName(){return this.username;}
}
