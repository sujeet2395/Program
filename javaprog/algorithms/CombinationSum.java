package Algorithms;

import java.util.*;
import java.lang.*;
import java.io.*;

public class CombinationSum {

    public static void comSum(int[] a, int ind, int v, List<Integer> r, List<ArrayList<Integer>> res) {

        if (v == 0) {
            res.add(new ArrayList<>(r));
            return;
        }
        int i;
        for (i = ind; i < a.length; i++) {
            if (a[i] <= v) {
                r.add(a[i]);
                comSum(a, i, v - a[i], r, res);
                r.remove(r.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int n;
            n = sc.nextInt();
            int i;

            Set<Integer> set = new TreeSet<>();
            i = 0;
            while (i < n) {
                set.add(sc.nextInt());
                i++;
            }
            int b = sc.nextInt();
            Iterator<Integer> it = set.iterator();
            int[] a = new int[set.size()];
            i = 0;
            while (it.hasNext()) {
                a[i] = (int) it.next();
                i++;
            }
            //Arrays.sort(a);
            List<Integer> r = new ArrayList<>();
            List<ArrayList<Integer>> res = new ArrayList<>();
            comSum(a, 0, b, r, res);

            if (!res.iterator().hasNext()) {
                System.out.print("Empty");
            } else {
                for (List<Integer> rr : res) {

                    System.out.print("(");
                    for (i = 0; i < rr.size(); i++) {
                        System.out.print(rr.get(i));
                        if (i < rr.size() - 1) {
                            System.out.print(" ");
                        }
                    }
                    System.out.print(")");
                }
            }
            System.out.println();
        }
    }
}
