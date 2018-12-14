package practicecodings;

import java.util.*;
import java.lang.*;
import java.io.*;

public class BalanceParen {

    /*package whatever //do not write package name here */
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = 0, i;
        try {
            t = Integer.parseInt(r.readLine());

            String s = "";
            Stack<Character> ss = new Stack<Character>();
            char ch, pch;
            while (t-- > 0) {
                s = r.readLine();
                i = 0;
                ss.push(new Character((ch = s.charAt(i++))));
                System.out.println("n " + ch + " " + (char) ss.peek());
                while (i < s.length()) {
                    ch = s.charAt(i);
                    switch (ch) {
                        case '}':
                            pch = '{';
                            break;
                        case ')':
                            pch = '(';
                            break;
                        case ']':
                            pch = '[';
                            break;
                        default:
                            pch = '\0';
                    }
                    if (!ss.empty() && (char) ss.peek() == pch) {
                        System.out.println(" pn " + ch + " " + (char) ss.peek());
                        ss.pop();

                    } else {
                        ss.push(new Character(ch));
                        System.out.println(" pushn " + ch + " " + (char) ss.peek());
                    }
                    i++;
                }
                if (ss.empty()) {
                    System.out.println("balanced");

                } else {
                    System.out.println("not balanced");
                }
                while (!ss.empty()) {
                    ss.pop();
                }
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
