package practicecodings;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LargestOneSeriesInMatrix {

    public static void main(String[] args) {
        int t, m, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            m = sc.nextInt();
            n = sc.nextInt();
            int[][] M = new int[m][n];
            boolean[][] V = new boolean[m][n];
            int i, j;
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            int[] count=new int[1];
            int max=Integer.MIN_VALUE;
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    if (M[i][j] == 1 && V[i][j] == false) {
                        V[i][j]=true;
                        count[0] = 1;
                        dfs(M, i, j, V, count);
                        if(count[0]>max)
                        {
                            max=count[0];
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }

    private static void dfs(int[][] M, int i, int j, boolean[][] V, int[] count) {
        int row=M.length;
        int col=M[0].length;
        int[] rowK={-1,-1,-1,0,1,1,1,0};
        int[] colK={-1,0,1,1,1,0,-1,-1};
        int k;
        for(k=0; k<8; k++)
        {
            if(isSafe(M,i+rowK[k],j+colK[k], V))
            {
                V[i+rowK[k]][j+colK[k]]=true;
                count[0]++;
                dfs(M,i+rowK[k],j+colK[k], V, count);
            }
        }
    }
    
    private static boolean isSafe(int[][] M, int i, int j, boolean[][] V) {
        if(i>=0 && i<M.length && j>=0 && j<M[0].length && M[i][j]==1 && V[i][j]==false)
             return true;
        return false;
    }
}
/*
input:
1
5
5
0 1 1 1 0
0 0 1 1 0
0 0 1 1 0
0 0 0 1 0
0 0 0 1 0
output:
9
*/