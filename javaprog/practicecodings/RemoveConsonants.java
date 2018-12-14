package practicecodings;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoveConsonants {

    public static String rem_consonants(String s) {
        StringBuilder sb = new StringBuilder();
        char[] v = {'a', 'e', 'i', 'o', 'u'};
        int i, j, shift = 'A' - 'a';
        for (i = 0; i < s.length(); i++) {
            for (j = 0; j < v.length; j++) {
                if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                    if (s.charAt(i) == v[j] || s.charAt(i) == (char) (v[j] + shift)) {
                        sb.append("" + s.charAt(i));
                        break;
                    }
                } else {
                    sb.append("" + s.charAt(i));
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int t=0, n, i;
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            t = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(RemoveConsonants.class.getName()).log(Level.SEVERE, null, ex);
        }
        String s = "";
        String vowels = "";
        while (t-- > 0) {
            try {
                s = br.readLine();
                System.out.println("s" + s);
            } catch (IOException e) {
                System.out.println("IO error");
            }
                //s=sc.nextLine();
            System.out.println("s" + s);
            vowels = rem_consonants(s);
            if (vowels.equals("")) {
                System.out.println("No Vowel");
            } else {
                System.out.println(vowels);
            }

        }
    }
}
