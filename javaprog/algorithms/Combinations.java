package Algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {
    public static String stringof(char[] com)
    {
        StringBuilder sb=new StringBuilder();
        int i;
        for(i=0; com[i]!='\0'; i++)
        {
            sb.append(com[i]);
        }
        return sb.toString();
    }
    public static void combination(char[] str, char[] com, int depth, int start, List<String> res) {
        
        int i;
        for(i=start; i<str.length; i++)
        {
            com[depth]=str[i];
            com[depth+1]='\0';
            res.add(stringof(com));
            if(i<str.length-1)
            {
                combination(str, com, depth+1, i+1, res);
            }
        }
    }
    public static void main(String[] args) {
//        char[] str=new String("ABCD").toCharArray();
//        char[] com=new char[str.length+1];
//        List<String> res=new LinkedList<>();
//        combination(str, com, 0, 0, res);
//        
//        for(String s: res)
//        {
//            System.out.println(s);
//        }
        combin(6, 3);
        
    }
    
    public static void combinationUtil(int arr[], int data[], int start, int end, int index, int r, ArrayList<ArrayList<Integer>> res) 
    { 
        // Current combination is ready to be printed, print it 
        if (index == r) 
        { 
            ArrayList<Integer> al=new ArrayList<>();
            for (int j=0; j<r; j++){
                //System.out.print(data[j]+" "); 
                al.add(data[j]);
            }
            res.add(al);
            //System.out.println(""); 
            return; 
        } 
  
        // replace index with all possible elements. The condition 
        // "end-i+1 >= r-index" makes sure that including one element 
        // at index will make a combination with remaining elements 
        // at remaining positions 
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r, res);
        } 
    }
    public static void combin(int n, int r) {
        int i;
        int[] str=new int[n];
        for(i=0; i<n; i++)
        {
            str[i]=i+1;
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int[] com=new int[r];
        combinationUtil(str, com, 0, n-1, 0, r, res);
        for(ArrayList<Integer> s: res)
        {
            System.out.println(s);
        }
    }
}
