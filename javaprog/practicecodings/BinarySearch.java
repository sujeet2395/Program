package practicecodings;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(long a[], long key)
    {
        int f=0,l=a.length-1,m=-1;
        while(f<=l)
        {
            System.out.println("whi");
            m=(f+l)/2;
            if(a[m]==key)
                return m;
            else if(key<a[m])
            {
                l=m-1;
            }else
            {
                f=m+1;
            }
        }
        return m;
    }
    public static void main(String[] args) {
//        long a[]={1,3,4,7,11};
//        long k=0;
//        k=binarySearch(a, k);
//        System.out.println(k);
//    }
        Scanner s = new Scanner(System.in);
        int t,q,i=0,p;
        t=s.nextInt();
        
        long a[]=new long[t];
        
        a[i]=s.nextLong();
        System.out.print(a[i]+" ");
        for(i=1; i<t; i++)
        {
            a[i]=s.nextLong();
            a[i]=a[i-1]+a[i];
            System.out.println(a[i]+" ");
        }
        
        q=s.nextInt();
        long tar[]=new long[q];
        i=0;
        tar[i]=s.nextLong();
        System.out.println(tar[i]+" ");
        for(i=1; i<q; i++)
        {
            tar[i]=s.nextLong();
            System.out.println(tar[i]+" ");
        }
        i=0;
        while(i<q)
        {
                p=binarySearch(a, tar[i]);
                System.out.println("np "+(p+1));
                if(p>=0 && p< a.length)
                {
                    if(p>0 && a[p-1]>=tar[i])
                        System.out.println(p);
                    else if(a[p]>=tar[i])
                        System.out.println(p+1);
                    else if((p+1)<a.length && a[p+1]>=tar[i])
                        System.out.println(p+2);
                    i++;
                }
                else
                {
                    System.out.println(-1);
                    i++;
                }
        }
    }
}
