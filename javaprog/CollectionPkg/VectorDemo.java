package CollectionPkg;

import java.util.Vector;
import static CollectionPkg.StackDemo.print;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v1=new Vector();
        v1.add("hello");
        v1.add("hi");
        v1.add(1,"me");
        v1.add(0, "you");
        v1.remove(1);
        v1.add(2);
        v1.add(new Integer(5));
        //System.out.println(v1);
        print(v1.iterator());
        Vector<String> v2=new Vector<String>(v1);
        v2.add(3,"hkj");
        System.out.println(v2.elementAt(1));
        print(v2.iterator());
    }
}
