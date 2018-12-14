package thread_demo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThreadDemo {
    public static void main(String[] args) {
        myThread t=new myThread("Hi");
        myThread t1=new myThread("Hello");
        t.start();
        t1.start();
        
    }
}

class myThread extends Thread
{
    private String msg;
    Thread t;
    myThread(String msg)
    {
        t=new Thread(this);
        this.msg=msg;
    }
    public void run()
    {
        int i=0;
        
        for(i=0; i<100; i++)
        {
            try {
                System.out.println(msg);
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                System.out.println("Thread error interruptted");
            }
        }
    }
}