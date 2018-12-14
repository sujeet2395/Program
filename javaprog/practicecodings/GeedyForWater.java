package practicecodings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class GeedyForWater {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);        
        int t, i, n, x;
        int[] bcap;
        t=s.nextInt();
        while(t-->0)
        {
            n=s.nextInt();
            x=s.nextInt();
            bcap=new int[n];
            for(i=0; i<n; i++)
            {
                bcap[i]=s.nextInt();
            }
            Arrays.sort(bcap);
            int curr=x;
            i=0;
            while(curr>0 && i<n)
            {
                curr-=bcap[i];
                if(curr<0)
                {
                    curr+=bcap[i];
                    break;
                }
                i++;
            }
            System.out.println(i);
        }
        
    }
}
