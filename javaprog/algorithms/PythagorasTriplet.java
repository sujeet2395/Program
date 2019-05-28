package Algorithms;

import java.util.Arrays;

public class PythagorasTriplet {
    public static boolean pythaTriplet(int[] a ) {
        int i, l, r;
        for(i=0; i<a.length; i++)
        {
            a[i]=a[i]*a[i];
        }
        Arrays.sort(a);
        for(i=a.length-1; i>=2; i--)
        {
            l=0;
            r=i-1;
            while(l<r)
            {
                if(a[l]+a[r]==a[i])
                {
                    return true;
                }else if(a[l]+a[r]<a[i])
                {
                    l++;
                }else{
                    r--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a={2,3,5,4};
        System.out.println(pythaTriplet(a));
    }
}
