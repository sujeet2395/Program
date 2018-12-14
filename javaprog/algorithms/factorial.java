package Algorithms;

import java.util.Scanner;

public class factorial {
    static int fact(int n)
    {
        if(n<=1) return 1;
        else return n*fact(n-1); 
    }
     public static void main(String[] args)
    {
        int n;
        long r;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number for calculating factorial");
        n=s.nextInt();
        r=fact(n);
        System.out.println("factorail of "+n+" is "+r);
    }
}
