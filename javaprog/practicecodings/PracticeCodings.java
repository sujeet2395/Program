package practicecodings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PracticeCodings {
    public static void main(String[] args) {
        int t, c1, c2, st;
        String s1 = "SUVO";
        String s2 = "SUVOJIT", str = "";
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            str = sc.next();
            st = 0;
            c1 = 0;
            c2 = 0;
            while ((st=str.indexOf(s2, st))!=-1) {
                System.out.println(""+str.substring(st, st+7));
                st += 7;
                c2++;
            }
            st = 0;
            while ((st=str.indexOf(s1, st))!=-1) {
                System.out.println(""+str.substring(st, st+4));
                st += 4;
                c1++;
            }
            c1 -= c2;
            System.out.println("SUVO = " + c1 + ", SUVOJIT = " + c2);
        }
    }

}
