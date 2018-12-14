package Algorithms;

public class RotateMatDiagonally {
    public static void main(String[] args) {
        
        int arr[][]= { {1, 2, 3, 4},
		{5, 6, 7, 8},
		{9, 10, 11, 12},
		{13, 14, 15, 16}
	};
	rotateDiagonally(arr);
        printMatrix(arr);
    }

    private static void rotateDiagonally(int[][] arr) {
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
