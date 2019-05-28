package practicecodings;

public class RotateMatrixBy {
    public static void swapColumm(int[][] mat) {
        int i, j, k, temp;
        for(i=0; i<mat.length; i++)
        {
            for(j=0, k=mat[0].length-1; j<k; j++, k--)
            {
                temp=mat[i][j];
                mat[i][j]=mat[i][k];
                mat[i][k]=temp;
            }
        }
    }
    public static void transpose(int[][] mat) {
        int i, j, temp;
        for(i=1; i<mat.length; i++)
        {
            for(j=0; j<i; j++)
            {
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    public static void rotateBy(int[][] mat) {
        transpose(mat);
        swapColumm(mat);
    }
    public static void main(String[] args) {
        int[][]mat ={{1,2,3,11},{4,5,6,12},{7,8,9,13}};
        rotateBy(mat);
        int i, j;
        for(i=0; i<mat.length; i++)
        {
            for(j=0; j<mat[0].length; j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    
    }
}
