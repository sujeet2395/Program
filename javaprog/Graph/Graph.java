package Graph;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph {

    private int v;
    private LinkedList<Integer>[] list;

    public Graph(int v) {
        this.v = v;
        list = new LinkedList[this.v];
        for(int i=0; i<v; i++)
        {
            list[i]=new LinkedList<>();
        }
    }
    public int getVertices()
    {
        return this.v;
    }
    public LinkedList<Integer> getAdjacencyList(int v)
    {
        return list[v];
    }
    public void addEdges(int e) {
        int i = 0;
        Scanner sc = new Scanner(System.in);

        while (i < e) {
            int temp = sc.nextInt();
            int temp2 = sc.nextInt();
            list[temp].add(temp2);
            i++;
        }
    }
}

class GraphT{
    private int v;
    private LinkedList<Integer>[] list;
    GraphT(int v)
    {
        this.v=v;
        list=new LinkedList[v];
        for(int i=0; i<v; i++)
        {
            list[i]=new LinkedList<>();
        }
    }
    public int getVertices()
    {
        return this.v;
    }
    public LinkedList<Integer> getAdjacencyList(int v)
    {
        return list[v];
    }
    public void addEdges(int u, int v) {
        list[u].add(v);
    }
    public int sumCount()
    {
        int sum=0;
        for(int v=0; v<this.v; v++)
        {
            sum+=list[v].size();
        }
        return sum;
    }
}
