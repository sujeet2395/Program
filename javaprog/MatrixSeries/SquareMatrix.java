package MatrixSeries;
import static MatrixSeries.MatrixSeries.sc;
public class SquareMatrix {
    
    private int[][] matrix;
    private int k;
    
    public SquareMatrix(int k) {
        this.matrix=new int[k][k];
        this.k = k;
    }
    public SquareMatrix(int[][] mat) {
        if(mat.length==mat[0].length){
            this.k = mat.length;
            this.matrix=mat;
        }
        else{
            this.k=0;
            this.matrix=null;
        }
    }

    public void setMatrix() {
        System.out.println("fill matrix");
        int i, j;
         for(i=0; i<k; i++)
            for(j=0; j<k; j++)
                matrix[i][j]=sc.nextInt();
         System.out.println("created matrix");
    }

    public int[][] getMatrix() {
        return matrix;
    }
    
    public static SquareMatrix mul(SquareMatrix ma, SquareMatrix mb) {
        int i, j, k;
        if(ma.k!=mb.k)
        {
            System.out.println("can not be multiplied");
            return null;
        }
        SquareMatrix mr=new SquareMatrix(ma.k);
        for(i=0; i<ma.k; i++)
        {
            for(j=0; j<mb.k; j++)
            {
                for(k=0; k<ma.k; k++)
                {
                    mr.matrix[i][j]+=ma.matrix[i][k]*mb.matrix[k][j];
                }
            }
        }
        return mr;
    }
    public static SquareMatrix transpose(SquareMatrix s) {
        int i, j;
        SquareMatrix r=new SquareMatrix(s.k);
        for(i=0; i<s.k; i++)
        {
            for(j=0; j<s.k; j++)
            {
                r.matrix[j][i]=s.matrix[i][j];
            }
        }
        return r;
    }
    public SquareMatrix transpose()
    {
        return SquareMatrix.transpose(this);
    }
    public void print() {
        int i, j;
        for(i=0; i<this.k; i++)
        {
            for(j=0; j<this.k; j++)
            {
                System.out.print(this.matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
