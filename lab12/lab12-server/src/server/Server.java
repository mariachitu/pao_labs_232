package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private static List<ServerThread> clients = new ArrayList<>();

    public static void broadcast(String message, long senderId) {
        clients.stream()
                .filter(c -> c.getId() != senderId)
                .forEach(c -> c.sendMessageToClient(message));
    }

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5555);
            System.out.println("The server has started");
            while(true) {
                System.out.println("Waiting for client");
                Socket client = server.accept();
                System.out.println("New client connected " + client.getInetAddress());
                ServerThread th = new ServerThread(client);
                th.start();
                th.sendMessageToClient("Welcome");
                clients.add(th);
            }
        } catch (IOException e) {
            new RuntimeException("connection to 5555 could not be established", e);
        }
    }
}
