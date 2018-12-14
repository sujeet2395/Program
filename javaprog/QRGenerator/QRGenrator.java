package QRGenerator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.image.ImageType;
import net.glxn.qrgen.QRCode;

public class QRGenrator {

    public static void main(String[] args) throws Exception{
        String details = "hi how r u?";
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
        File f = new File("E:\\sujeet\\netbeans_project\\JavaProg\\src\\QRGenerator\\MYQRCode.jpg");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
//        String str ="Navin, mhesh, madhav, haga, bhan";
//        String s[]=str.split(", ");
//        for(String ss:s)
//            System.out.println(ss);
    }

}
