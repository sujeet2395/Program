/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.awt.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * () -> 1; (A+B) -> value of A + B; (A) -> 2*A
 *
 * input (()(())) = (1(1))= (1+2)= (3) = 2*3
 *
 * @author Sharma
 */
public class StringScore {

    private static int[] en = null;

    public static int score(int lo, int hi) {
        if (lo == hi - 1) {
            return 1;
        }
        int mid = en[lo];

        if (mid == hi) {
            return 2 * score(lo + 1, hi - 1);
        }
        return score(lo, mid) + score(mid + 1, hi);
    }

    public static int scanofParen(String s) {
        int i, n = s.length();
        en = new int[n];
        Stack<Integer> st = new Stack<>();
        for (i = 0; i < s.length(); i++) {
            int t;
            if (s.charAt(i) == ')') {
                t = st.peek();
                st.pop();
                en[t] = i;
            } else {
                st.push(i);
            }
        }
        return score(0, n - 1);
    }

    public static void main(String[] args) {
        String s="((()(())))()";
        System.out.println(scanofParen(s));
    }
}
