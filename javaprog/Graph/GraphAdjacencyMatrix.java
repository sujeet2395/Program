package Graph;

import java.util.Scanner;

public class GraphAdjacencyMatrix {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n,m,x,y,q;
        n=s.nextInt();
        
        boolean mat[][]=new boolean[n][n];
        m=s.nextInt();
        
        while(m-->0)
        {
            x=s.nextInt();
            y=s.nextInt();
            mat[x-1][y-1]=true;
            mat[y-1][x-1]=true;
        }
        q=s.nextInt();
        while(q-->0)
        {
            x=s.nextInt();
            y=s.nextInt();
            if(mat[x-1][y-1])
            {
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
        
    }
}
