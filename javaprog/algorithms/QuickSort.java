package Algorithms;

public class QuickSort {
    public static void swap(int[] a, int i, int j) {
        int t;
        //System.out.println(i+" "+j);
        t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static int partition(int[] a, int low, int high) {
        
        //swap(a, low, (low+high)/2);
        //swap(a, low, high);
        int i=low+1, k=low+1;
        
        while(i<=high)
        {
            if(a[i]<a[low])
                swap(a, i, k++);
            i++;
        }
        swap(a, k-1, low);
        return k-1;
    }
    public static void quickSort(int[] a, int low, int high) {
        int pivot;
        if(low<high)
        {
            pivot=partition(a, low, high);
            quickSort(a, low, pivot-1);
            quickSort(a, pivot+1, high);
        }
    }
    public static void main(String[] args) {
         int[] a={4,2,7,6,3,1};
        
        quickSort(a, 0, a.length-1);
       
        for(int aa:a )
        {
            System.out.println(aa+" ");
        }
    }
}
