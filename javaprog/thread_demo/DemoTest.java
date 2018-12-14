package thread_demo;

public class DemoTest {
    public static void main(String[] args) {
        myThreadRunnable tr=new myThreadRunnable();
        myThreadRunnable tr1=new myThreadRunnable();
        
    }
}

class myThreadRunnable implements Runnable
{
    Thread t;

    public myThreadRunnable() {
        t=new Thread(this);
        t.start();
    }
    
    public void run()
    {
        task();
    }
    
    private void task()
    {
        int i;
        for(i=0; i<10; i++)
            System.out.println(i+"  ");

    }
}