package ServerClientNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientThread extends Thread{

    private Socket socket;
    private String clientInput="stop";
    public ClientThread(Socket socket)
    {
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            out.println("Hello client, it's me!");
            BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            do{
            clientInput=input.readLine();
            System.out.println(clientInput);
            }while(!clientInput.equals("stop"));
            input.close();
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
