package practicecodings;

import java.util.Scanner;

public class XorCipher {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            String pass=reverse(s);
            System.out.println(s.equals(pass));
            System.out.println(pass);
        }
    }

    private static String reverse(String s) {
        StringBuilder pass=new StringBuilder();
        int l=s.length()/2+1;
        int i=0;
        pass.append(Integer.toHexString(Integer.parseInt(""+s.charAt(i),16)).toUpperCase());
        i++;
        while(i<l)
        {
            pass.append(Integer.toHexString(Integer.parseInt((""+s.charAt(i)), 16)^Integer.parseInt((""+s.charAt(i-1)), 16)).toUpperCase());
            i++;
        }
        return pass.toString();
    }
}
