package ServerClientNet;

import static java.lang.System.out;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfaceCardView {
    public static void main(String[] args) {
        try {
            InetAddress addr=InetAddress.getByName("192.168.100.7");
            NetworkInterface netCard=NetworkInterface.getByInetAddress(addr);
            System.out.println(netCard.getDisplayName());
            System.out.println(netCard.getInetAddresses());
            List<InterfaceAddress> list=netCard.getInterfaceAddresses();
            for(InterfaceAddress a:list)
            {
                System.out.println("Ip is:"+a.getAddress().getHostAddress());
            }
            System.out.println(netCard.toString());
        } catch (SocketException ex) {
            Logger.getLogger(InterfaceCardView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(InterfaceCardView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
