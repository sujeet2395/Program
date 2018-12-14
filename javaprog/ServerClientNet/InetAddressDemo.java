package ServerClientNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
//            InetAddress address=InetAddress.getLocalHost();
//            System.out.println(address.getHostAddress());
//            System.out.println(address.getHostName());
//            InetAddress address1=InetAddress.getByName("www.google.com");
//            System.out.println(address1.getHostAddress());
//            System.out.println(address1.getHostName());

            InetAddress address=InetAddress.getByName("Localhost");
            System.out.println("server ip address"+address.getHostAddress());
            Socket socket=new Socket(address, 9090);
            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(input.readLine());
            String send="Hello Server";
            out.println(send);
            Scanner sc=new Scanner(System.in);
            do{
                send=sc.nextLine();
                out.println(send);
            }while(!send.equals("stop"));
            input.close();
            out.close();
            sc.close();
        } catch (UnknownHostException ex) {
            Logger.getLogger(InetAddressDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InetAddressDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
