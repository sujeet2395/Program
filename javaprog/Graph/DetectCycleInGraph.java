package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DetectCycleInGraph {
    
    public static boolean hasCycle(Graph g) {
        int vCount=g.getVertices();
        int[] set=new int[vCount];
        int v;
        for(v=0; v<vCount; v++)
        {
            set[v]=0;//every vertices are in white set ie not visited yet;
        }
        
        for(v=0; v<vCount; v++)
        {
            if(set[v]==0)//if vetice is not visited yet ie it is in white set;
            {
                if(DFSUtil(g, v, set)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean DFSUtil(Graph g, int v, int[] set) {
            set[v]=1;
            //System.out.println(v+" ");
            LinkedList<Integer> list=g.getAdjacencyList(v);
            for(Iterator<Integer> it = list.iterator(); it.hasNext();)
            {
                int u=(int)it.next();
                if(set[u]==2)//already in black set. means exhausted vertex;
                {
                    continue;
                }
                if(set[u]==1)//already in white set. vertex is being visited;
                {
                    return true;
                }
                if(set[u]==0)
                {
                    if(DFSUtil(g, u, set))
                        return true;
                }
            }
            set[v]=2;
            return false;
        }
    
    public static void main(String[] args) {
        Graph g=new Graph(6);
        g.addEdges(5);
        System.out.println(hasCycle(g));
    }
}


/*

class GfG
{
    private boolean dfs(int current, LinkedList<Integer>[] alist,boolean[] visited,boolean[] explored) {
        //move current to gray set from white set and then explore it.
        visited[current]=true;
        for(int neighbor : alist[current].ite) {
            //if in black set means already explored so continue.
            if (blackSet.contains(neighbor)) {
                continue;
            }
            //if in gray set then cycle found.
            if (graySet.contains(neighbor)) {
                return true;
            }
            if(dfs(neighbor, whiteSet, graySet, blackSet)) {
                return true;
            }
        }
        //move vertex from gray set to black set when done exploring.
        moveVertex(current, graySet, blackSet);
        return false;
    }

    private void moveVertex(int vertex,boolean[] visited,boolean[] explored) {
        explored[vertex]=true;
    }
    
    public boolean hasCycle(int v,LinkedList<Integer>[] alist,boolean[] visited,boolean[] explored) 
     {
        for(int current=0; current<v; current++) {
            if(visited[current]==false) {
                if(dfs(current, alist, visited, explored))
                    return true;
            }
        }
        return false;
     }
}
*/