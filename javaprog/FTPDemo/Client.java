package FTPDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    public static void main(String[] args) {
        try {    
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader reader=new BufferedReader(in);
            
            String ipAddress="";
            String fileName="";
            boolean isValid = false;
            
            while(!isValid)
            {
                System.out.println("Please enter the a valid server IP address");
                ipAddress=reader.readLine();
                InetAddressValidator validator= new InetAddressValidator();
                isValid = validator.isValid(ipAddress);
            }
            System.out.println("Please enter a file name: ");
            fileName = reader.readLine();
            Socket socket= new Socket(ipAddress, 9090);
            BufferedInputStream input=new BufferedInputStream(socket.getInputStream());
            PrintWriter out=new PrintWriter(socket.getOutputStream(), true);
            out.println(fileName);
            
            int code = input.read();
            if(code == 1)
            {
                File file=new File("C:\\Users\\Sharma\\Downloads\\"+fileName);
                BufferedOutputStream outputfile = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int bytesRead=0;
                while((bytesRead = input.read(buffer))!=-1)
                {
                    System.out.println(".");
                    outputfile.write(buffer, 0, bytesRead);
                    outputfile.flush();
                }
                System.out.println();
                System.out.println("File: "+fileName+" was successfully downloaded!");
            }else{
                System.out.println("File is not present on the server");
            }
        } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    private static class InetAddressValidator {

        public InetAddressValidator() {
        }

        private boolean isValid(String ipAddress) {
            
            boolean isValid = false;
            try {
                InetAddress addr = InetAddress.getByName(ipAddress);
                isValid = true;
            } catch (UnknownHostException ex) {
                 isValid = false;
            }
            return isValid;
        }
    }
}
