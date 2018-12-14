package demotest;

class Base extends Exception {
}

class Derived extends Base {
}

public class ExceptionTest {

    public static void main(String args[]) {
        // some other stuff
        try {
            // Some monitored code
            throw new Base();
        } catch (Derived d) {
            System.out.println("Caught derived class exception");
        } catch (Base d) {
            System.out.println("Caught base class exception");
        }catch (Exception e) {
            System.out.println("Caught Exceotion class exception");
        }
    }
}

//class ExceptionTest1 {
//
//    private int s;
//
//    public static void main(String[] args) {
//        int x = 10;
//        int y = 0;
//        double z;
//
//        try {
//            z = x / y;
//        } catch (Exception e) {
//            System.out.println("Got the  Exception " + e);
//        }
//    }
//}
