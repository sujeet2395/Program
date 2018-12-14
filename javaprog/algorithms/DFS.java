package Algorithms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS {
    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.addEdges(7);
        g.DFSTravesal();
    }
    private static class Graph
    {
        private int v;
        private LinkedList<Integer>[] list;
        public Graph(int v)
        {
            this.v=v;
            list=new LinkedList[this.v];
            for(int i=0; i<this.v; i++)
            {
                list[i]=new LinkedList<>();
            }
        }
        
        public void addEdges(int e)
        {
            int i = 0;
            Scanner sc=new Scanner(System.in);
            while(i!=e){
                int temp = sc.nextInt();
                int temp2 = sc.nextInt();
                list[temp].add(temp2);
                i++;
            }
            sc.close();
        }
        
        public void DFSTravesal()
        {
            boolean[] isVisited=new boolean[this.v];
            int v;
            for(v=0; v<this.v; v++)
            {
                if(isVisited[v]==false)
                {
                    DFSUtil(v, isVisited);
                }
            }
        }

        public void DFSUtil(int v, boolean[] visited) {
            visited[v]=true;
            System.out.println(v+" ");
            for(Iterator<Integer> it = list[v].iterator(); it.hasNext();)
            {
                int u=(int)it.next();
                if(visited[u]==false)
                {
                    DFSUtil(u, visited);
                }
            }
        }
    }
}
