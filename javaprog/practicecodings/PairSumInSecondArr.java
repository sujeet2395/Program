package practicecodings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSumInSecondArr {
    public static void pairSumInArr(int[] a, int[] b) {
        Arrays.sort(b);
        int i, j, k;
        for(i=0; i<a.length; i++)
        {
            for(j=i+1; j<a.length; j++)
            {
                if(Arrays.binarySearch(b, (a[i]+a[j]))>=0)
                    System.out.println(a[i]+" "+a[j]+" "+Arrays.binarySearch(b, (a[i]+a[j])));
//                for(k=0; k<b.length; k++)
//                {
//                    if((a[i]+a[j]) <= b[k])
//                    {
//                        if((a[i]+a[j])==b[k])
//                        {
//                            System.out.println(a[i]+" "+a[j]);
//                        }
//                    }
//                }
                
            }
        }
    }
    public static void main(String[] args) {
        int[] a={2,8,5,1,3,4};
        int[] b={3,7,9,6};
        pairSumInArr(a, b);
    }
}
