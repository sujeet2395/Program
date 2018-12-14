package Algorithms;

import java.util.*;

public class MergeSortCount {

    private static int c=0;
    public static void merge(int[] a, int low, int mid, int high, Integer[] count) {
        int[] b=new int[high-low+1];
        int k=0, i=low, j=mid+1;
        while(i<=mid && j<=high)
        {
            if(a[i]<a[j]){
                b[k++]=a[i++];
                count[0]++;
                c++;
            }
            else
                b[k++]=a[j++];
        }
        while(i<=mid)
        {
            b[k++]=a[i++];
        }
        while(j<=high)
        {
            b[k++]=a[j++];
        }
        for(k-=1, i=high; k>=0; k--, i--)
        {
            a[i]=b[k];
        }
    }
    public static void mergeSort(int[] a, int low, int high, Integer[] count) {
        int mid;
        
        if(low<high)
        {
            mid=(low+high)/2;
            mergeSort(a, low, mid, count);
            mergeSort(a, mid+1, high, count);
            merge(a, low, mid, high, count);
        }
    }
    
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }
        Integer[] count=new Integer[1];
        count[0]=0;
        mergeSort(a,0, a.length-1, count);
        System.out.print(count[0]+" "+c);

    }
}
