package client;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new ReceiveMessageFromServer().start();

        while (true)    {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine();
            Client.getInstance().sendMessageToServer(message);
        }
    }
}
