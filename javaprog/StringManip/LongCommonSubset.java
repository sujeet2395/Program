package StringManip;

import java.util.Scanner;

public class LongCommonSubset {

    public static int lps(String s1, String s2) {
        int[][] m = new int[s1.length() + 1][s2.length() + 1];
        int i, j, pi = 0, pj = 0;
        int max = -1;
        for (i = 0; i <= s1.length(); i++) {
            m[i][0] = 0;
        }
        for (i = 1; i <= s2.length(); i++) {
            m[0][i] = 0;
        }
        for (i = 1; i <= s1.length(); i++) {
            for (j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    m[i][j] = m[i - 1][j - 1] + 1;
                }
                if (m[i][j] > max) {
                    max = m[i][j];
                    pi = i;
                    pj = j;
                }
            }
        }

        /*while(m[pi][pj]>0 && pi>0 && pj>0)
        {
            System.out.println(s1.charAt(pi-1)+" "+s2.charAt(pj-1));
            pi--; pj--;
        }*/
        return max;
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int l1 = sc.nextInt();
            int l2 = sc.nextInt();
            String s1 = "";
            s1 = sc.next();
            String s2 = "";
            s2 = sc.next();
            System.out.println(lps(s1, s2));
        }
    }
}
/*

1
83 86
LRBBMQBHCDARZOWKKYHIDDQSCDXRJMOWFRXSJYBLDBEFSARCBYNECDYGGXXPKLORELLNMPAPQFWKHOPKMCO
QHNWNKUEWHSQMGBBUQCLJJIVSWMDKQTBXIXMVTRRBLJPTNSNFWZQFJMAFADRRWSOFSBCNUVQHFFBSAQXWPQCAC

output:
2
*/