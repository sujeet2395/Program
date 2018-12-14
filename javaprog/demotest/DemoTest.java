package demotest;
public class DemoTest {
    int d=28;

    public DemoTest() {
        d=20;
    }
    
    public static void main(String[] args) {
        
//        Double object = new Double(2.4);
//        int a = object.intValue();
//        byte b = object.byteValue();
//        float d = object.floatValue();
//        double c = object.doubleValue();
// 
//        System.out.println(a + b + c + d );
//        StringBuffer a = new StringBuffer("geeks");
//        StringBuffer b = new StringBuffer("forgeeks");
//        a.delete(1,3);
//        a.append(b);
//        System.out.println(a);
//        System.out.println(new DemoTest().d);

//          int s=-1;
//          s=s>>>30;
//          System.out.println(s);

        String s1 = "geeksquiz";
        String s2 = new String(s1);//"geeksquiz";
        if(s1==s2)
        System.out.println("s1 == s2 is:" + (s1 == s2));
    }
}
