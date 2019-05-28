package practicecodings;

import java.util.HashMap;
import java.util.Map;

public class NumberOccursMorethanHalfofN {
    public static int numOccursByHN(int[] a) {
        int k=0, i, maxCount=Integer.MIN_VALUE;
        Map<Integer, Integer> m=new HashMap<>();
        for(i=0; i<a.length; i++)
        {
            if(m.containsKey(a[i]))
            {
                m.put(a[i], m.get(a[i])+1);
            }else{
                m.put(a[i], 1);
            }
            
        }
        for(Map.Entry<Integer, Integer> e: m.entrySet())
        {
            if(e.getValue()>=a.length/2)
                k=e.getKey();
        }
        return k;
    }
    public static void main(String[] args) {
        int[] a={2,6,2,6};
        System.out.println(numOccursByHN(a));
    }
}
