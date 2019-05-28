package DivideNConquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceOfN {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int m, n;
            m = sc.nextInt();
            n = sc.nextInt();
            //String sofar="";
            //int[] count=new int[1];
            //count[0]=0;
            //seqn(m,n,"",count);
            //System.out.println(count[0]);
            int[][] count = new int[m + 1][n + 1];
            int c = seqnDP(m, n, count, "");
            System.out.println(c);
        }
    }

    private static int seqnDP(int m, int n, int[][] count, String sofar) {
        if (m < n || m == 0 && n > 0) {
            return 0;
        }
        if (m >= 0 && n == 0) {
            //System.out.println(sofar);
            return 1;
        }
        int sum = 0, v = 0;
        for (int i = m; i >= n; i--) {
            if (i >= 0 && n >= 0 && count[i][n] > 0) {
                sum += count[i][n];
                break;
            } else {
                v = seqnDP(i / 2, n - 1, count, sofar + i + " ");
                sum += v;
            }
        }
        count[m][n] = sum;
        return sum;
    }

    private static void seqn(int m, int n, String sofar, int[] count) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            count[0]++;
            System.out.println(sofar);
            return;
        }
        for (int i = m; i > 0; i--) {
            seqn(i / 2, n - 1, sofar + i + " ", count);
        }
    }
}
