package StringManip;

import java.util.Scanner;

import java.util.*;
import java.lang.*;
import java.io.*;
/*
not showing correct on this
For Input:
1
rfkqyuqfjkxy
Output of Online Judge is:
r
*/
public class LongPalindromicString {

    public static String lps(String s) {
        int[][] m = new int[s.length()][s.length()];
        int i, j, l;
        for (i = 0; i < s.length(); i++) {
            m[i][i] = 1;
        }
        for (i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                m[i][i + 1] = 2;
            } else {
                m[i][i + 1] = 1;
            }
        }
        for (l = 3; l < s.length(); l++) {
            for (i = 0; i < s.length() - l; i++) {
                j = i + l - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    m[i][j] = m[i + 1][j - 1] + 2;
                } else {
                    m[i][j] = (m[i][j - 1] > m[i + 1][j]) ? m[i][j - 1] : m[i + 1][j];
                }
            }
        }
        i = 0;
        j = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                sb.append(s.charAt(i));
                i++;
                j--;
            } else if (m[i][j - 1] > m[i + 1][j]) {
                j--;
            } else {
                i++;
            }
        }
        if (i == j) {
            sb.append(s.charAt(i));
            for (i = sb.length() - 2; i >= 0; i--) {
                sb.append(sb.charAt(i));
            }
        } else {
            for (i = sb.length() - 1; i >= 0; i--) {
                sb.append(sb.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            String s = "";
            s = sc.next();
            System.out.println(lps(s));
        }
    }
}
