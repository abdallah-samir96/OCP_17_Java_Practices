package server.impl;

import server.mode.Message;
import server.service.MessageService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MessageServiceImpl extends UnicastRemoteObject implements MessageService {
    private final List<Message> messageList;

    private static final String FOLDER_PATH = "." + File.separator + "src" + File.separator +"server" + File.separator + "files";
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

    @Override
    public boolean send(String fileName, byte[] file) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        var folderPath = Path.of(FOLDER_PATH);
        System.out.println("folder path : " + folderPath);

        if(Files.notExists(folderPath)) {
            Files.createDirectories(folderPath);
        }
        var directParentFolder = Files.createDirectory(folderPath.resolve(UUID.randomUUID().toString()));
        var filePath = directParentFolder.resolve(fileName);
        Files.write(filePath, file);
        return true;
    }
}
