package Algorithms;

import static java.lang.Math.max;
import java.util.Scanner;

public class KnapsackZeroOne {
    public static int knapsackDublicat(int[] val, int[] wt, int n, int W) {
        int[] K=new int[W+1];
        for(int i=0;i<=W;i++){
            for(int j=0;j<n;j++){
                if(i>=wt[j])
                    K[i]=max(val[j]+K[i-wt[j]], K[i]);
            }
        }
        return K[W];
    }
    public static int knapsackZeroOne(int[] val, int[] w, int n, int W) {
        int i, j;
        int m[][]=new int[n+1][W+1];
                        
            for(i=1; i<=n; i++)
            {
                for(j=1; j<=W; j++)
                {
                    if(w[i-1]>j)
                    {
                        m[i][j]=m[i-1][j];
                    }else{
                        m[i][j]=max(val[i-1]+m[i-1][j-w[i-1]], m[i-1][j]);
                    }
                }
            }
           /* for(i=0; i<=n; i++)
            {
                for(j=0; j<=W; j++)
                {
                    System.out.print(m[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println(m[n][W]);
            
            for(i=n, j=W; i>=1 && j>=1 && m[i][j]>0;)
            {
                if(m[i][j]==m[i-1][j])
                {
                    i-=1;
                }else{
                    System.out.println("v "+val[i-1]+",w "+w[i-1]);
                    j-=w[i-1];
                    i-=1;
                }
            }*/
           return m[n][W];
    }
    public static void main(String[] args) {
        int n, t, i, j;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
                        
            int W=sc.nextInt();
            int w[]=new int[n];
            int val[]=new int[n];
            for(i=0; i<n; i++)
            {
                val[i]=sc.nextInt();
            }
            for(i=0; i<n; i++)
            {
                w[i]=sc.nextInt();
            }

            //System.out.println(knapsackZeroOne(val, w, n, W));
            System.out.println(knapsackDublicat(val, w, n, W));
            
        }
    }
}
