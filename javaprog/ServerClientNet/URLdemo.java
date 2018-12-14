package ServerClientNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class URLdemo {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://www.facebook.com/profile.php?id=100007226351003");
            URLConnection con=url.openConnection();
            String line="";
            BufferedReader input=new BufferedReader(new InputStreamReader(con.getInputStream()));
            while((line=input.readLine())!=null)
            {
                System.out.println(line);
            }
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(URLdemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(URLdemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
