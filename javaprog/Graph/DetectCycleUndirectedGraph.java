package Graph;

import java.io.*;
import java.util.*;

public class DetectCycleUndirectedGraph {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int v = in.nextInt();
            int e = in.nextInt();
            LinkedList<Integer>[] alist = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                alist[i] = new LinkedList<Integer>();
            }
            while (e-- > 0) {
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                alist[n1].add(n2);
                alist[n2].add(n1);
            }
            GfG g = new GfG();
            if (g.isCyclic(v, alist)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

 /*Complete the function below*/
class GfG {

    Boolean isCyclic(int V, LinkedList<Integer>[] alist) {
        boolean[] visited = new boolean[V];

        for (int v = 0; v < V; v++) {
            if (visited[v] == false) {
                if (dfsUtil(v, alist, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfsUtil(int c, LinkedList<Integer>[] alist, boolean[] visited, int parent) {
        visited[c] = true;
        for (Iterator itr = alist[c].iterator(); itr.hasNext();) {
            int n = (int) itr.next();
            if (n == parent) {
                continue;
            }
            if (visited[n] == true) {
                return true;
            }
            if (dfsUtil(n, alist, visited, c)) {
                return true;
            }
        }
        return false;
    }
}
