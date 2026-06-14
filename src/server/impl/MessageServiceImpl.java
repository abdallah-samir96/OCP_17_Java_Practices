package server.impl;

import server.mode.Message;
import server.service.MessageService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceImpl extends UnicastRemoteObject implements MessageService {
    private final List<Message> messageList;

    public MessageServiceImpl() throws RemoteException {
        System.out.println("Initialization of Message Service");
        this.messageList = new ArrayList<>();
    }
    @Override
    public boolean send(Message message) {
        this.messageList.add(message);
        return true;
    }

    @Override
    public List<Message> getAll() {
        System.out.println("Trying to get All Messages");
        return new ArrayList<>(this.messageList);
    }
}
