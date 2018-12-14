package CollectionPkg;

import static CollectionPkg.StackDemo.print;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set s1=new HashSet();
        s1.add(1);
        s1.add(4);
        s1.add(2);
        s1.add("ai");
        s1.add(4);
        s1.add("je");
        if(s1.contains(3))
            System.out.println("contained");
        else
            s1.add(3);
        print(s1.iterator());
        Set<Integer> s2=new HashSet<>();
        s2.add(1);
        s2.add(4);
        s2.add(2);
        //s2.add("ai");
        s2.add(4);
        //s2.add("je");
        if(s2.contains(3))
            System.out.println("contained");
        else
            s2.add(3);
        print(s2.iterator());
        Set s3=new TreeSet();
        s3.add(1);
        s3.add(4);
        s3.add(2);
        //s3.add("ai");
        s3.add(4);
        //s3.add("je");
        if(s3.contains(3))
            System.out.println("contained");
        else
            s3.add(3);
        print(s3.iterator());
        SortedSet s4=new TreeSet();
        s4.add(1);
        s4.add(4);
        s4.add(2);
        //s4.add("ai");
        s4.add(4);
        //s4.add("je");
        if(s4.contains(3))
            System.out.println("contained");
        else
            s4.add(3);
        print(s4.iterator());
        //SortedSet s5=(SortedSet) new HashSet(); //can't do cast;
        
    }
}
