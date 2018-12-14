package practicecodings;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LongCommonPrefix {

    public static int findminlen(String ar[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].length() < min) {
                min = ar[i].length();
            }
        }
        return min;
    }

    public static boolean allcontainsprefix(String[] ar, String str, int start, int end) {
        int i, j;
        for (i = 0; i < ar.length; i++) {
            for (j = start; j <= end; j++) {
                if (ar[i].charAt(j) != str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String commonprefix(String[] ar) {
        int index = findminlen(ar);
        int low = 0, high = index - 1;
        int mid;
        String prefix = "";
        while (low <= high) {
            mid = (low + high) / 2;
            if (allcontainsprefix(ar, ar[0], low, mid)) {
                prefix = prefix + ar[0].substring(low, mid + 1);
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        int t, n, i;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        String[] ar = null;
        String prefix = "";
        while (t-- > 0) {
            n = sc.nextInt();
            ar = new String[n];
            for (i = 0; i < n; i++) {
                ar[i] = sc.next();
            }
            prefix = commonprefix(ar);
            if (prefix.equals("")) {
                System.out.println(-1);
            } else {
                System.out.println(prefix);
            }

        }
    }
}
