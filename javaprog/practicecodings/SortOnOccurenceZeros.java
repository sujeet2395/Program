package practicecodings;

import java.util.*;
import java.lang.*;

class GFG {

    public static void main(String[] args) {
        int t, i, j, n, m, x, count = 0;
        final int ms = 1000;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] ca = new int[ms][2];
            for (i = 0; i < n; i++) {
                count = 0;
                for (j = 0; j < m; j++) {
                    x = sc.nextInt();
                    if (x == 0) {
                        count++;
                    }
                }
                ca[i][0] = count;
                ca[i][1] = i;
            }

            Arrays.sort(ca, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return (a[0] < b[0]) ? -1 : 1;
                }
            });

            for (i = 0; i < n; i++) {
                System.out.print((ca[i][1] + 1) + " " + ca[i][0]);
            }
            System.out.println();
        }
    }
}
