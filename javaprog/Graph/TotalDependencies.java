package Graph;

import java.util.*;
import java.lang.*;
import java.io.*;
import Graph.GraphT;

public class TotalDependencies {

    public static void main(String[] args) {
        int t, v, e;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            v = sc.nextInt();
            e = sc.nextInt();
            GraphT g = new GraphT(v);
            int i = 0;
            while (i < e) {
                int temp = sc.nextInt();
                int temp2 = sc.nextInt();
                g.addEdges(temp, temp2);
                i++;
            }
            int x = g.sumCount();
            System.out.println(x);
        }
    }
}

/**
 * 2
17 3
4 3 3 12 0 13 
43 9
30 7 30 36 8 42 38 21 7 0 3 41 10 26 15 33 0 40
 */