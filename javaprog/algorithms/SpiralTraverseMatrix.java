package Algorithms;

public class SpiralTraverseMatrix {
    public static void spiralTraverse(int [][] m) {
        int i, t, l, r, b;
        t=0; l=0;
        r=m[0].length;
        b=m.length;
        while(t<b && l<r)
        {
            for(i=l; i<r; i++)
            {
                System.out.print(m[t][i]+" ");
            }
            t++;
            for(i=t; i<b; i++)
            {
                System.out.print(m[i][r-1]+" ");
            }
            r--;
            if(t<b){
                for(i=r-1; i>=l; i--)
                {
                    System.out.print(m[b-1][i]+" ");
                }
                b--;
            }
            if(l<r){
                for(i=b-1; i>=t; i--)
                {
                    System.out.print(m[i][l]+" ");
                }
                l++;
            }
            
        }
    }
    public static void main(String[] args) {
        int [][]m=new int[][]{{1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}};
        spiralTraverse(m);
    }
    
}
