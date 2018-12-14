package WebServer;

import ServerClientNet.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    public static void main(String[] args) {
        int port = 80;
        try {
            InetAddress bindAddr=InetAddress.getByName("127.18.0.4");
            ServerSocket serverSocket = new ServerSocket(port, port+2, bindAddr);
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
            System.out.println(port + " is open!"+ ex);
        }
    }
}
