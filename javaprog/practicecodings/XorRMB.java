package practicecodings;

import java.util.Scanner;

public class XorRMB {
    public static void main(String[] args) {
        int t, n, x;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
	while(t-->0)
	{
	    n=sc.nextInt();
	    int i=0;
	    int xor;
	    xor=0;
	    while(i<n)
	    {
	        x=sc.nextInt();
	        xor=xor^x;
	        i++;
	    }
	    if((xor&1)==1)
	    {
	        System.out.println("YES");
	    }else{
	        System.out.println("NO");
	    }
	}
    }
}
