package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeK_SortedArraysDes {
    public static void mergeTwoArr(int[] a, int n1, int l1, int n2, int l2)
    {
        //l1 : length of array a[n1...n1 + l1-1]
        //l2 : length of array a[n2...n2 + l2-1]
        int i=n1, j=n2, kk=0;
        int[] res=new int[l1+l2];
        while(i<n1+l1 && j<n2+l2)
        {
            if(a[i]<a[j])
                res[kk++]=a[i++];
            else 
                res[kk++]=a[j++];
        }
        while(i<n1+l1)
        {
            res[kk++]=a[i++];
        }
        while(j<n2+l2)
        {
            res[kk++]=a[j++];
        }
        kk=0;
        for(i=n1; i<n2+l2; i++, kk++)
        {
            a[i]=res[kk];
        }
    }
    public static void mergeKSortedArr(int[] a, int f, int l, int k) {
        int mid=0;
        int l1=0, l2=0, n1=0, n2=0;
        if(f<l)
        {
            mid=(f+l)/2;
            mergeKSortedArr(a, f, mid, k);
            mergeKSortedArr(a, mid+1, l, k);
            n1=f*k;
            l1=(mid-f+1)*k;
            n2=(mid+1)*k;
            l2=(l-mid)*k;
            mergeTwoArr(a, n1, l1, n2, l2);
        }
    }
    
    
    public static void main(String[] args) {
        int[] a;
        int n, k, i, t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            k = sc.nextInt();
            n = sc.nextInt();
            a=new int[k*n];
            for(i=0; i<a.length; i++)
            {
                a[i]=sc.nextInt();
            }
            //method 1: mergesort apply on rows i.e. dividing n rows and each pair is in sorted array and now merge it;
            //O((2*k)log(n))
            mergeKSortedArr(a, 0, n-1, k);
            //method 2: O((nk)*log(nk))
            //Arrays.sort(a);
            for(i=a.length-1; i>=0; i--)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
