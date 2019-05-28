package Algorithms;

public class MaxSumPathinMatrix {
    public static int maxSumPath(int[][] mat) {
        int[][] d=new int[mat.length+1][mat[0].length+1];
        int i, j;
        for(i=1; i<d.length; i++)
        {
            for(j=1; j<d[0].length; j++)
            {
                if(d[i-1][j]>=d[i][j-1])
                {
                    d[i][j]=mat[i-1][j-1]+d[i-1][j];
                }else{
                    d[i][j]=mat[i-1][j-1]+d[i][j-1];
                }
            }
        }
        for(i=0; i<d.length; i++)
        {
            for(j=0; j<d[0].length; j++)
            {
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        return d[d.length-1][d[0].length-1];
    }
    public static void main(String[] args) {
        int[][] mat={{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
        System.out.println(maxSumPath(mat));
    }
}

/*
minimum path
if(A.size() == 0){
        return 0;
    }
    
    int rows = A.size();
    int cols = A[0].size();
    
    vector<vector<int> > temp(rows, vector<int>(cols));
    
    int sum = 0;
    
    for(int i = 0; i < cols; i++){
        temp[0][i] = sum + A[0][i];
        sum = temp[0][i];
    }
    
    sum = 0;
    
    for(int i = 0; i < rows; i++){
        temp[i][0] = sum + A[i][0];
        sum = temp[i][0];
    }
    
    for(int i = 1; i < rows; i++){
        for(int j = 1; j < cols; j++){
            temp[i][j] = A[i][j] + min(temp[i-1][j], temp[i][j-1]);
        }
    }
    
    return temp[rows-1][cols-1];

*/
