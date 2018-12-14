package Algorithms;

import static java.lang.Math.max;

public class LongPalinSubseq {
    
    public static int longPalinSubstring(String s1) {
        char s[]=s1.toCharArray();
        int i, j, l, start, maxlen=Integer.MIN_VALUE;
        boolean t[][]=new boolean[s1.length()][s1.length()];
        for(i=0; i<s1.length(); i++)
        {
            t[i][i]=true;
        }
        
        for(l=2; l<=s1.length(); l++)
        {
            for(i=0; i<s1.length()-l+1; i++)
            {
                j=i+l-1;
                if(l==2 && s[i]==s[j])
                {
                    t[i][j]=true;
                }else if(t[i+1][j-1] && s[i]==s[j])
                {
                    t[i][j]=true;
                    if(l>maxlen)
                    {
                        start=i;
                        maxlen=l;
                    }
                }
            }
        }
        return maxlen;
    }
    
    public static int longPalinSubseq(String s1) {
        char s[]=s1.toCharArray();
        int i, j, l;
        int t[][]=new int[s1.length()][s1.length()];
        for(i=0; i<s1.length(); i++)
        {
            t[i][i]=1;
        }
        
        for(l=2; l<=s1.length(); l++)
        {
            for(i=0; i<s1.length()-l+1; i++)
            {
                j=i+l-1;
                if(l==2 && s[i]==s[j])
                {
                    t[i][j]=2;
                }else if(s[i]==s[j])
                {
                    t[i][j]=t[i+1][j-1]+2;
                }else {
                    t[i][j]=max(t[i+1][j], t[i][j-1]);
                }
            }
        }
        return t[0][s1.length()-1];
    }
    public static int longPalinSubseqRecursive(char str[],int start,int len){
        if(len == 1){
            return 1;
        }
        if(len ==0){
            return 0;
        }
        if(str[start] == str[start+len-1]){
            return 2 + longPalinSubseqRecursive(str,start+1,len-2);
        }else{
            return Math.max(longPalinSubseqRecursive(str, start+1, len-1), longPalinSubseqRecursive(str, start, len-1));
        }
    }
    
    public static void main(String[] args) {
        String s="asbbaabba";
        System.out.println(""+longPalinSubstring(s));
        System.out.println(""+longPalinSubseq(s));
        System.out.println(""+longPalinSubseqRecursive(s.toCharArray(), 0, s.length()));        
    }
}
