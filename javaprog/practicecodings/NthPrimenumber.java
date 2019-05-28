package practicecodings;

import java.util.Arrays;

public class NthPrimenumber {
    public static int nthPrime(int n) {
        if(n==1)
            return 2;
        if(n==2)
            return 3;
        boolean[] prime=new boolean[6*n+1];
        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]=false;
        
        int k, i;
        for(k=2; k<=(prime.length-1)/2; k++)
        {
            for(i=2; i*k<=prime.length-1; i++)
            {
                prime[i*k]=false;
            }
        }
        k=0;
        for(i=2; i<prime.length; i++)
        {
            if(prime[i])
            {
                k++;
            }
            if(k==n)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(nthPrime(n));
    }
}
