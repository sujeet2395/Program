package demotest;

interface a{
    default public void dosome(){
        System.out.println("int a");
    }
}

interface b{
    default public void dosome(){
        System.out.println("int b");
    }
}
interface ab extends a,b{
    default public void dosome(){
        System.out.println("int ab");
    }
}
public class InterfaceDemo implements ab{
//    public void dosome()
//    {
//        System.out.println("hello");
//    }
    public static void main(String[] args) {
        InterfaceDemo id=new InterfaceDemo();
        id.dosome();
        a aa=new InterfaceDemo();
        b bb=new InterfaceDemo();
        aa.dosome();
        bb.dosome();
        ab aabb=new InterfaceDemo();
        aabb.dosome();
    }
}
