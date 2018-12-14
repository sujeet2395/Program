package Algorithms;

import java.util.*;
import java.lang.*;
import java.io.*;

public class PermutationDistinctAlpha {

    public static void p(char[] ss, int ind, int n, ArrayList<String> set) {
        if (ind == n) {
            String s = new String(ss);
            set.add(s);

            return;
        }
        int i;
        char t;
        for (i = ind; i < n; i++) {
            t = ss[ind];
            ss[ind] = ss[i];
            ss[i] = t;
            p(ss, ind + 1, n, set);
            t = ss[ind];
            ss[ind] = ss[i];
            ss[i] = t;
        }
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char[] ss = s.toCharArray();
            //Arrays.sort(ss);
            ArrayList<String> set = new ArrayList<String>();
            p(ss, 0, ss.length, set);
            Collections.sort(set);
            for (String sp : set) {
                System.out.print(sp + " ");
            }
            System.out.println();
        }
    }
}
