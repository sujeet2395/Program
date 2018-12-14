package practicecodings;

import java.util.ArrayList;

public class Solution {
    int a;
    public static void main(String[] args) {
        int i = 5, k;
    
        //i = (i++) * (++i);
        i = (i)*(++i);
        System.out.println("v "+i+" "+(new Solution()).a);
    }
}
