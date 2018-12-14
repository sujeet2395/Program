package thread_demo;

public class thread_demo {

    public static void main(String[] args) {
        new msg("msg1");
        new msg2("msg2");
        new msg3("msg3");
        Thread msg4 = new Thread(() -> {
            System.out.println("msg4 Thread");
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("msg4");
                    Thread.sleep(240);
                }
            } catch (InterruptedException e) {
                System.out.println("msg4 interrupted");
            }
            System.out.println("msg4 Thread");
        }, "msg4 Thread");
        msg4.start();
        new msg5();
    }
}

class msg implements Runnable {

    Thread t;
    String name;

    public msg(String name) {
        this.name = name;
        this.t = new Thread(this);
        t.start();
    }

    public void run() {
        System.out.println(t);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("msg1");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("msg1 interrupted ");
        }
        System.out.println("msg1 thread");
    }

}

class msg2 {

    Thread t;
    String name;

    public msg2(String name) {
        this.name = name;
        this.t = new Thread(new Runnable() {
            public void run() {
                System.out.println(t);
                try {
                    for (int i = 5; i > 0; i--) {
                        System.out.println("msg2");
                        Thread.sleep(210);
                    }
                } catch (InterruptedException e) {
                    System.out.println("msg2 interrupted ");
                }
                System.out.println("msg2 thread");
            }
        });
        t.start();
    }

}

class msg3 {

    Thread t;
    String name;

    public msg3(String s) {
        name = s;
        t = new Thread(new runimp(this));
        t.start();
    }
}

class runimp implements Runnable {

    msg3 th;

    public runimp(msg3 th) {
        this.th = th;
    }

    public void run() {
        System.out.println(th.t);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("msg3");
                Thread.sleep(230);
            }
        } catch (InterruptedException e) {
            System.out.println("msg3 Interrupted");
        }
        System.out.println("msg3 thread");
    }
}

class msg5 extends Thread {

    public msg5() {
        super("msg5");
        start();
    }

    public void run() {
        System.out.println("msg5 " + this);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("msg5");
                Thread.sleep(230);
            }
        } catch (InterruptedException e) {
            System.out.println("msg5 Interrupted");
        }
        System.out.println("msg5 thread");
    }
}
