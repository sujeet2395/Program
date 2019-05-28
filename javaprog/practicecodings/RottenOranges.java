package practicecodings;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*NOt Correct result */
public class RottenOranges {

    private static class Pair{
        int x;
        int y;
        int level;
        public Pair(int x, int y, int level)
        {
            this.x=x;
            this.y=y;
            this.level=level;
        }
    }
    public static int rottenOrg(int[][] matrix, int r, int c)
    {
        int minTime=0;
        int i, j;
        int fresh=0, count=0;
        Queue<Pair> q=new LinkedList<>();
        int[][] dir_set={{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir;
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                if(matrix[i][j]==2)
                {
                    q.add(new Pair(i, j, 0));
                }
                else if(matrix[i][j]==1)
                {
                    fresh++;
                }
            }
        }
        //q.add(new Pair(-1,-1, -1));//end of level
        //int found=0;
        
        while(!q.isEmpty())
        {
            boolean flag=false;
            Pair p=q.remove();
//            if(p.x==-1 && p.y==-1)
//            {
//                if(!q.isEmpty())
//                {
//                    q.add(new Pair(-1, -1));
//                }
//                minTime++;
//            }
//            else{
                for(dir=0; dir<dir_set.length; dir++)
                {
                    int dx=p.x+dir_set[dir][0];
                    int dy=p.y+dir_set[dir][1];
                    if(dx<0 || dx>=r || dy<0 || dy>=c)
                        continue;
                    if(matrix[dx][dy]==1)
                    {
                        count++;
                        matrix[dx][dy]=2;
                        q.add(new Pair(dx,dy, p.level+1));
                        flag=true;
                    }
                }
                if(flag)
                {
                    minTime=p.level+1;
                }
//            }
        }
        if(count==fresh)
        {
            return minTime;
        }
        return -1;
    }
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        //int[][] matrix={{1, 1, 1}, {0, 2, 1}, {1, 1, 1}};
        t=sc.nextInt();
        while(t-->0)
        {
            int r, c;
            r=sc.nextInt();
            c=sc.nextInt();
            int matrix[][]=new int[r][c];
            int i, j;
            for(i=0; i<r; i++)
            {
                for(j=0; j<c; j++)
                {
                    matrix[i][j]=sc.nextInt();
                }
            }
            System.out.println(rottenOrg(matrix, r, c));
        }
    }   
}
