package practicecodings;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestLargest {
    
    public static int[] kthSmallestLargest(int[] a, int k) {
        int[] res=new int[2];
        Arrays.sort(a);
        res[0]=a[k-1];
        res[1]=a[a.length-k];
        return res;
    }
    
    public static void main(String[] args) {
        int[] a;
        int n, k, i, t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            
            n = sc.nextInt();
            k = sc.nextInt();
            a = new int[n];

            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int r[];
            r=kthSmallestLargest(a,k);
            System.out.println(r[0]+" "+r[1]);
        }
    }
  
}
