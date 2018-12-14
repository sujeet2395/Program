package ServerClientNet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        int port = 9090;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            boolean stop=false;
            while(!stop)
            {
                System.out.println("waiting for client..");
                Socket clientSocket=serverSocket.accept();
                System.out.println("client is connected..");
                ClientThread clientThread=new ClientThread(clientSocket);
                clientThread.start();
            }

        } catch (IOException ex) {
            System.out.println(port + "is open!");
        }
    }
}
