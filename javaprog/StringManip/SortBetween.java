package StringManip;

import java.util.Arrays;

public class SortBetween {
    public static void main(String[] args) {
        String s="oiuytre";
        int i=1, j=5;
        char[] str=s.substring(i, j+1).toCharArray();
        Arrays.sort(str);
        StringBuilder sb=new StringBuilder();
        sb.append(s.substring(0, i));
        sb.append(str);
        sb.append(s.substring(j+1));
        System.out.println(""+sb.toString());
        
    }
}
