package Algorithms;

public class MergeSort {
    public static void merge(int[] a, int low, int mid, int high) {
        int[] b=new int[high-low+1];
        int k=0, i=low, j=mid+1;
        while(i<=mid && j<=high)
        {
            if(a[i]<a[j])
                b[k++]=a[i++];
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
    public static void mergerSort(int[] a, int low, int high) {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergerSort(a, low, mid);
            mergerSort(a, mid+1, high);
            merge(a, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int[] a={4,2,7,6,3,1};
        
        mergerSort(a, 0, a.length-1);
        //merge(a, 0, 2, 5);
        for(int aa:a )
        {
            System.out.println(aa+" ");
        }
    }
}
