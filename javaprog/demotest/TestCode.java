package demotest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class A
{
	
}
class B extends A
{
	
}
	
public class TestCode {
	public int a=0;
    public static void main(String[] args) throws ClassNotFoundException	{
		//String ar[]={"sujeet", "java", "kumar"};
	show(4,6,3);
	Class s=Class.forName("java.lang.Object");
	System.out.println(s.getSuperclass());
        for(Field ss: s.getDeclaredFields())
            System.out.println("field: " +ss);
        for(Method sm:s.getDeclaredMethods())        
	System.out.println(sm);
	B b=new B();
	if(b instanceof Object)
	System.out.println("t");
    }
    
	private static void show(double... ar)
	{
		for(double s:ar)
		System.out.println(s);
	}
}
