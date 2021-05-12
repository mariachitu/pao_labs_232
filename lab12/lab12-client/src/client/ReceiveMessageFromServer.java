package client;

import java.io.IOException;

public class ReceiveMessageFromServer extends Thread {

    @Override
    public void run()   {
        while (true)    {
            try {
                String message = Client.getInstance().getMessageFromServer();
                System.out.println("Message received from the server: " + message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
