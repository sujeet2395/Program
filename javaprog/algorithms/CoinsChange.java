package Algorithms;

import java.util.Scanner;

public class CoinsChange {

    public static int coinsChange(int[] a, int n, int v) {
        int[][] m=new int[n+1][v+1];
        int i, j;
        for(i=0; i<m.length; i++)
        {
            m[i][0]=1;
        }
        for (i = 1; i < m.length; i++) {
            for(j=1; j<m[0].length; j++)
            {
                if(j-a[i-1]>=0)
                {
                    m[i][j]=m[i-1][j]+m[i][j-a[i-1]];
                }else{
                    m[i][j]=m[i-1][j];
                }
            }
        }
        return m[n][v];
    }
    
    public static void coinsChange(int[] a, int n, int ind, int v, int[] ways) {
        if (v == 0) {
            ways[0]++;
            return;
        }
        if (v < 0) {
            return;
        }
        int i;
        for (i = ind; i < n; i++) {
            coinsChange(a, n, i, v - a[i], ways);
        }
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n, v;
            n = sc.nextInt();
            int i;
            int[] coins = new int[n];
            for (i = 0; i < n; i++) {
                coins[i] = sc.nextInt();
            }

            v = sc.nextInt();
            int[] ways = new int[1];
            ways[0] = 0;
            coinsChange(coins, n, 0, v, ways);
            System.out.println(ways[0]);
            //System.out.println(coinsChange(coins, n, v));
            
        }
    }
}
