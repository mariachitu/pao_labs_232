package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private BufferedReader bufferedReader;
    private PrintWriter printWriter;

    private Client()    {
        try {
            Socket socket = new Socket("localhost", 5555);
            this.bufferedReader = new BufferedReader(new InputStreamReader((socket.getInputStream())));
            this.printWriter = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            new RuntimeException("connection to 5555 could not be established", e);
        }
    }

    public void sendMessageToServer(String message) {
        printWriter.println(message);
    }

    public String getMessageFromServer() throws IOException {
        return bufferedReader.readLine();
    }

    public static Client getInstance()  {
        return SingletonHolder.INSTANCE;
    }

    private static final class SingletonHolder    {
        private static final Client INSTANCE = new Client();
    }
}
