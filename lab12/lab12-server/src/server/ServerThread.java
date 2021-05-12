package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {

    private BufferedReader in;
    private PrintWriter out;

    public ServerThread(Socket socket) throws IOException {
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new PrintWriter(socket.getOutputStream(), true);
    }

    public void sendMessageToClient(String message) {
        out.println(message);
    }

    @Override
    public void run()   {
        while (true)    {
            try {
                //read input
                String message = in.readLine();
                System.out.println("The server got this message from client " + this.getId() + ": " + message);

                //broadcast
                Server.broadcast(message, this.getId());
            } catch (Exception e)   {
                System.out.println("Client disconnected");
            }
        }
    }
}
