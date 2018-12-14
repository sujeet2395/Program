package practicecodings;

import java.util.Scanner;

public class CountSquaresInMbyN {
    public static void main(String[] args) {
        int t;
        long m, n;
	Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
	while(t-->0)
	{
	    m=sc.nextInt();
            n=sc.nextInt();
	    long k=(m<n)? m-1: n-1;
	    long c;
	    c=m*n*(k+1)-(m+n)*k*(k+1)/2+k*(k+1)*(2*k+1)/6;
	    System.out.println(c);
	}
    }
}
