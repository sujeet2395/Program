package practicecodings;

import java.util.Scanner;

public class CombiSubarrSum {

    public static void comSum(int[] a, int ind, int val, String sfar, int setsum) {
        if (ind == a.length) {
            if (setsum == val) {
                sfar = sfar.substring(0, sfar.length() - 1);
                System.out.print(sfar + ")");
            }
            return;
        }
        comSum(a, ind + 1, val, sfar + a[ind] + " ", setsum + a[ind]);
        comSum(a, ind + 1, val, sfar, setsum);
    }

    public static void main(String[] args) {
        int t;
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            int q = 0;
            int[] a = new int[n];
            while (q < n) {
                a[q] = sc.nextInt();
                q++;
            }
            int val;
            int setsum = 0;
            val = sc.nextInt();
            boolean[] b = new boolean[a.length];
            comSum(a, 0, val, "(", setsum);
            System.out.println();
        }
    }
}
