package practicecodings;

import java.util.Scanner;

public class LinearSearch {
    static int search(long arr[], int n, long x)
    {
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n,i=0;
        long k;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        long a[]=new long[n];
        while(i<n)
        {
            a[i++]=sc.nextLong();
        }
        k=sc.nextInt();
        int res=search(a,n,k);
        if(res!=-1)
        System.out.println(res);
        
    }
}
