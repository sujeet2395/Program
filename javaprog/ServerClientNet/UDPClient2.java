package ServerClientNet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDPClient2 {
    public static void main(String[] args) {
        DatagramSocket clientSocket;
        try {
            clientSocket = new DatagramSocket(0);
        
            byte[] sendData = new byte[1024];
            byte[] receiveData = new byte[1024];
            
            InetAddress serverAddress=InetAddress.getByName("Localhost");
            String stringSendData="";
            DatagramPacket sendPacket;
            
            int i=0;
            while(i<4)
            {
                clientSocket.setSoTimeout(3000);
                stringSendData = "Hello Server! from 1";
                sendData = stringSendData.getBytes();
               
                sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9090);
                clientSocket.send(sendPacket);
                i++;
            }
            
            while(true){
                stringSendData = "text from 2";
                sendData = stringSendData.getBytes();
                sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9090);
                clientSocket.send(sendPacket);
                
                //i++;
            }
            //clientSocket.close();
            } catch (SocketException ex) {
            Logger.getLogger(UDPClient1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(UDPClient1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UDPClient1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
