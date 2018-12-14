package javaprog;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


//public class graphicsdemo {
//    public static void main(String[] args) {
//        JFrame f=new JFrame("Graphics Demo");
//        demographics dg =new demographics();
//        dg.setBackground(Color.WHITE);
//        f.add(dg);
//        f.setSize(400,400);
//        f.setVisible(true);
//    }
//}

public class demographics extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        
        g.drawRect(20,10, 100, 30);
        g.drawLine(20,50, 100, 40);
        g.drawOval(20, 90,100, 50);
        g.drawString("Hello World", 20,160);
        
    }
}