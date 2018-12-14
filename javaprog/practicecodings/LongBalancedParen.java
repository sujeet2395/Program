package practicecodings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LongBalancedParen {

    /*package whatever //do not write package name here */
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = 0, i;
        try {
            t = Integer.parseInt(r.readLine());
            String s = "";
            
            char ch, pch;
            while (t-- > 0) {
                s = r.readLine();
                Stack<Character> ss = new Stack<Character>();
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
                    System.out.println(s.length());

                } else {
                    int count = 0;
                    while (!ss.empty()) {
                        ss.pop();
                        count++;
                    }
                    count = s.length() - count;
                    System.out.println(count);
                }

            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
