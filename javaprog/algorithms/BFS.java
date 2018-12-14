package Algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        final int N=11;
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer>[] adj = new ArrayList[N];
            for (int i = 0; i < N; i++) {
                adj[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                adj[a].add(b);
            }
            
            boolean vis[] = new boolean[N];
            for (int i = 0; i < N; i++) {
                vis[i] = false;
            }
            GFG obj = new GFG();
            obj.bfs(1, adj, vis);
            System.out.println();
        }
    }
}

class GFG {

    public static void bfs(int s, ArrayList<Integer> adj[], boolean visited[]) {
        Queue q = new LinkedList();
        q.add(new Integer(s));
        while (!q.isEmpty()) {
            int v = (int) q.remove();
            if (visited[v] == false) {
                visited[v] = true;
                System.out.print(v + " ");
                ArrayList<Integer> n = adj[v];
                for(Iterator itr=n.iterator(); itr.hasNext(); ) {
                    int vd=(int)itr.next();
                    if(visited[vd]==false)
                        q.add(vd);
                }
            }
        }
    }
}
