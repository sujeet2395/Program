package Algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Dijkstra {
    
    public static void main (String[] args)
    {	
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[][] graph = new int[21][21];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    graph[i][j] = sc.nextInt();
                }
            }
            int src = sc.nextInt();
            GfG g = new GfG();
            g.dijkstra(graph, src, n);
            System.out.println();
        }
    }
}

class GfG
{   public static void dijkstra(int graph[][], int s, int V)
    {
        int[] dist=new int[V];
        boolean[] sptSet=new boolean[V];
        int i;
        for(i=0; i<V; i++)
        {
            dist[i]=Integer.MAX_VALUE;
            sptSet[i]=false;
        }
        dist[s]=0;
        int count;
        for(count=0; count<V-1; count++)
        {
            int u=minDistance(dist, sptSet, V);
            sptSet[u]=true;
            for(int v=0; v<V; v++)
            {
                if(sptSet[v]==false && graph[u][v]>0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][v]<dist[v])
                {
                    dist[v]=dist[u]+graph[u][v];
                }
            }
        }
        printDist(dist, V);
    }

    private static int minDistance(int[] dist, boolean[] sptSet, int V) {
        int min=Integer.MAX_VALUE, minIndex=0;
        int i;
        for(i=0; i<V; i++)
        {
            if(sptSet[i]==false && dist[i]<=min)
            {
                min=dist[i]; minIndex=i;
            }
        }
        return minIndex;
    }

    private static void printDist(int[] dist, int V) {
        int i;
        for(i=0; i<V; i++)
        {
            System.out.print(dist[i]+" ");
        }
    }
}