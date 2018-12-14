package ServerClientNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PingDemo {
    public static void main(String[] args) {
        try {
//            InetAddress address= InetAddress.getByName("talentgo.com");
//            System.out.println(address.isReachable(1000));

            Process p=Runtime.getRuntime().exec("ping talentgo.com");
            String cmdOut="";
            boolean isReachable=true;
            BufferedReader input=new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while((cmdOut=input.readLine())!=null)
            {
                System.out.println(cmdOut);
                if(cmdOut.contains("Destination host unreachable"))
                {
                    isReachable=false;
                    break;
                }
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(PingDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
