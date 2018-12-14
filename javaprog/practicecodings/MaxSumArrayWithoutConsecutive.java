package practicecodings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxSumArrayWithoutConsecutive {
    
    public static int maxSumWithoutConsecutive(int[] a) {
        int sum=0;
        Arrays.sort(a);
        int i=a.length-1;
        Set<Integer> s=new HashSet<>();
        while(i>0)
        {
            if(!s.contains(a[i]-1) && Arrays.binarySearch(a, a[i]-1)>0)
            {
                s.add(a[i]-1);
                sum+=a[i];
                while(a[i]==a[i-1])
                {
                    sum+=a[i];
                    i--;
                }
            }
            i--;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] a={1,2,2,2,3,4};
        System.out.println(""+maxSumWithoutConsecutive(a));
    }
}
