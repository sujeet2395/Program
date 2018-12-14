package practicecodings;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestInRange {
    public static long secSmall(long[] a, int l, int r) {
        
//        long[] g=Arrays.copyOfRange(a, l, r+1);
////        for(long aa:g)
////            System.out.println(aa+"");
//        Arrays.sort(g);
////        for(int i=0; i<g.length; i++)
////            System.out.println(g[i]+"");
//        if(g[0]==g[g.length-1])
//        {
//            return -1;
//        }
//        return g[1];
        
        int i;
        long m1=a[l], m2=100001;
        for(i=l+1; i<=r; i++)
        {
            if(a[i]<m1)
            {
                m2=m1;
                m1=a[i];
            }else if(m1!=a[i] && a[i]<m2){
                m2=a[i];
            }
        }
        if(m1==m2 || m2==100001)
        {
            return -1;
        }
        return m2;
    }
    public static void main(String[] args) {
        long[] a;
        int q, n, i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new long[n];
        
        for(i=0;i<n; i++){
            a[i]=sc.nextInt();
        }
        
        q=sc.nextInt();
        int l, r;
        while(q-->0)
        {
            l = sc.nextInt();
            r = sc.nextInt();
            System.out.println(secSmall(a, l, r));
        }
        
    }
}
