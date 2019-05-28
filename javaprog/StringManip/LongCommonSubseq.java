package StringManip;

import java.util.Scanner;

public class LongCommonSubseq {

    public static int lps(String s) {
        int[][] m = new int[s.length()][s.length()];
        int i, j, l;
        for (i = 0; i < s.length(); i++) {
            m[i][i] = 1;
        }
        for (l = 1; l < s.length(); l++) {
            for (i = 0; i < s.length() - l; i++) {
                j = i + l;
                if (s.charAt(i) == s.charAt(j)) {
                    m[i][j] = m[i + 1][j - 1] + 2;
                } else {
                    m[i][j] = (m[i][j - 1] > m[i + 1][j]) ? m[i][j - 1] : m[i + 1][j];
                }
            }
        }
        return m[0][s.length() - 1];
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
