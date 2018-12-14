package ServerClientNet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket=new DatagramSocket(0);
            byte[] sendData = new byte[1024];
            byte[] receiveData = new byte[1024];
            
            InetAddress serverAddress=InetAddress.getByName("Localhost");
            
            String stringSendData = "Hello Server!";
            sendData = stringSendData.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9090);
            clientSocket.send(sendPacket);
            
            DatagramPacket receivePacket=new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            receiveData=receivePacket.getData();
            String stringReceiveData=new String(receiveData);
            System.out.println("From server: "+stringReceiveData);
            clientSocket.close();
            
            
        } catch (SocketException ex) {
            Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
