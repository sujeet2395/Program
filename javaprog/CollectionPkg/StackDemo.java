package CollectionPkg;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(4);
        s.push(2);
        s.push("je");
        s.push(3.3f);
        System.out.println(""+s);
        print(s.iterator());
        Stack<String> s1=new Stack<String>();
        s1.push("shel");
        s1.push("djkl");
        s1.push("me");
        System.out.println(""+s1.peek());
        s1.pop();
        print(s1.iterator());
        
        
    }
    public static void print(Iterator i)
    {
        for( ; i.hasNext(); )
        {
            System.out.println(""+i.next()) ;
        }
    }
}
