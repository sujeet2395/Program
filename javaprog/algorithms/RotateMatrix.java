package Algorithms;

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        int t, i, j, r, c;
        int[][] arr;
        t=s.nextInt();
        while(t-->0)
        {
            r=s.nextInt();
            c=s.nextInt();
            arr=new int[r][c];
            for(i=0; i<r; i++)
            {
                for(j=0; j<c; j++)
                {
                    arr[i][j]=s.nextInt();
                }
            }
            rotateBy90(arr);
            printMatrix(arr);
        }
    }

    private static void rotateBy90(int[][] arr) {
        transpose(arr);
        swapColumn(arr);
    }

    private static void transpose(int[][] arr) {
        int i, j, t;
        for(i=0; i<arr.length-1; i++)
        {
            for(j=i+1; j<arr[0].length; j++)
            {
                t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
    }

    private static void swapColumn(int[][] arr) {
        int i, j, t;
        for(j=0; j<arr[0].length/2; j++)
        {
            for(i=0; i<arr.length; i++)
            {
                t=arr[i][j];
                arr[i][j]=arr[i][arr[0].length-j-1];
                arr[i][arr[0].length-j-1]=t;
            }
        }
    }

    private static void printMatrix(int[][] arr) {
        int i, j;
        for(i=0; i<arr.length; i++)
        {
            for(j=0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
/*
input:
1
4
4
1 5 9 13 
2 6 10 14 
3 7 11 15 
4 8 12 16
output:
4 3 2 1 
8 7 6 5 
12 11 10 9 
16 15 14 13 
*/