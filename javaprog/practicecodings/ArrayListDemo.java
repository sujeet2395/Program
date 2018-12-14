package practicecodings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(2);
        l.add(4);
        l.add(1);
        l.add(8);
        l.add(6);
        Collections.sort(l, new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a, Integer b)
            {
                return b-a;
            }
        });
        int i, j, x;
        for(i=0, j=l.size()-1; i<j; i++, j--)
        {
            x=l.remove(j);
            l.add(j-1, l.remove(i));
            l.add(i,x);
        }
        System.out.println(l);
    }
}
