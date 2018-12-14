package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class Permutation {
    public static void permutationUtil(char s[], int count[], char result[], int level) {
        if(level==result.length)
        {
            print(result);
            return;
        }
        int i;
        for(i=0; i<s.length; i++)
        {
            if(count[i]==0)
            {
                continue;
            }
            result[level]=s[i];
            count[i]--;
            permutationUtil(s, count, result, level+1);
            count[i]++;
        }
        
    }
    public static void permutaion(String s) {
        int i;
        Map<Character, Integer> countMap=new HashMap<>();
        for(i=0; i<s.length(); i++)
        {
            if(countMap.containsKey(s.charAt(i)))
            {
                countMap.put(s.charAt(i), countMap.get(s.charAt(i))+1);
            }else{
                countMap.put(s.charAt(i), 1);
            }
        }
        i=0;
        char s1[]=new char[countMap.size()];
        int count[]=new int[countMap.size()];
        
        for(Map.Entry<Character, Integer> entry : countMap.entrySet())
        {
            s1[i]=entry.getKey();
            count[i]=entry.getValue();
            i++;
        }
        char result[]=new char[s.length()];
        permutationUtil(s1, count, result, 0);
    }

    public static void main(String[] args) {
        permutaion("aabc");
    }

    private static void print(char[] result) {
        int i;
        for(i=0; i<result.length; i++)
        {
            System.out.print(""+result[i]);
        }
        System.out.println();
    }
}
