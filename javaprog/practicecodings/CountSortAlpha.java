package practicecodings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CountSortAlpha {
    public static void main(String[] args) throws IOException {
        int t;
        String s="";
        //Scanner sc= new Scanner(System.in);
        //t=sc.nextInt();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        t=(int)Integer.parseInt(br.readLine());
        while(t-->0)
        {
            s=br.readLine();
            System.out.println(countSortAlpha(s));
        }
    }

    private static String countSortAlpha(String s) {
        StringBuilder st=new StringBuilder();
        int[][] ac=new int[26][2];
        int i=0;
        for(i=0; i<s.length(); i++)
        {
            int in=s.charAt(i)-'a';
            ac[in][0]+=1;
            ac[in][1]=(char)('a'+in);
        }
        Arrays.sort(ac, new Comparator<int []>()
        {
            @Override
            public int compare(int[] a, int[] b)
            {
                return (a[0]<b[0])?-1: 1;
            }
        });
        for(i=0; i<26; i++)
        {
            st.append((char)(ac[i][1]));
        }
        return st.toString();
    }
}
