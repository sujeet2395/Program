package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

//Dynamic Programming
public class Factotial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        int t, i, n;
        int size=0, cap=10;
        long[] fac=new long[cap];
        t=s.nextInt();
        while(t-->0)
        {
            n=s.nextInt();
            if(n>=0 && n<size)
            {
                System.out.println(fac[n]);
            }else{
                
                if(n>=cap)
                {
                    cap=cap*2;
                    while(n>=cap)
                    {
                        cap=cap*2;
                    }
                    long[] temp=new long[cap];
                    for(i=0; i<fac.length&&size>0; i++)
                    {
                        temp[i]=fac[i];
                    }
                    fac=temp;
                }
                
                if(size==0)
                {
                    fac[0]=fac[1]=1;
                    size=2;
                }
                i=size;
                while(i<=n)
                {
                    fac[i]=(fac[i-1]*i)%(1000000000+7);
                    i++;
                    size++;
                }
                System.out.println(fac[n]);
            }
        }
     
    }
}
