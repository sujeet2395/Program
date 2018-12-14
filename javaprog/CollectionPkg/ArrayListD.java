package CollectionPkg;

import static CollectionPkg.StackDemo.print;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListD {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        print(l.iterator());
        List l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add("dj");
        l1.add(0, "hello");
        print(l1.iterator());
        List l2= new LinkedList();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add("dj");
        l2.add(0, "hello");
        print(l2.listIterator(2));
        List<Integer> l3= new LinkedList<>();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        //l3.add("dj");
        //l3.add(0, "hello");
        print(l3.listIterator(2));
    }

}
