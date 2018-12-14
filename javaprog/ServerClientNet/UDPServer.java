package ServerClientNet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket socket=new DatagramSocket(9090);
            byte[] sendData = new byte[1024];
            byte[] receiveData = new byte[1024];
            
            while(true)
            {
                DatagramPacket receivePacket=new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                receiveData=receivePacket.getData();
                String sentence=new String(receiveData);
                System.out.println("Received : "+sentence);
                
                String stringSendData = "Hello Client!";
                sendData = stringSendData.getBytes();
                InetAddress clientAddress=receivePacket.getAddress();
                int clientPort=receivePacket.getPort();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                socket.send(sendPacket);
                
            }
        } catch (SocketException ex) {
            Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
