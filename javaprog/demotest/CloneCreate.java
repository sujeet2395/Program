package demotest;

class Test implements Cloneable
{
    
}

public class CloneCreate extends Test
{
    int a;
 
    CloneCreate cloning()
    {
        try
        {
            return (CloneCreate) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("CloneNotSupportedException is caught");
            return this;
        }
    }
}
 
class demo
{
 
    public static void main(String args[])
    {
        CloneCreate obj1 = new CloneCreate();
        CloneCreate obj2;
        obj1.a = 10;
        obj2 = obj1.cloning();
        obj2.a = 20;
 
        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
    }
}
