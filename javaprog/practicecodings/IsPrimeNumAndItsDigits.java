package practicecodings;

/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

public class IsPrimeNumAndItsDigits {

    public static boolean isPr(int n) {
        int i = 2;
        int sqrtf = (int) Math.sqrt(n);
        for (i = 2; i <= sqrtf; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        if(n==1 || n==0)
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int t, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            int q = n, r;
            int f = 1;

            while (q > 0) {
                r = q % 10;
                if (isPr(r) == false) {
                    f = 0;
                    break;
                }
                q = q / 10;
            }

            if (f == 1 && isPr(n) == false) {
                f = 0;
            }

            if (f == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
