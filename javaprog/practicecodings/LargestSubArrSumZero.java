/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecodings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LargestSubArrSumZero {
    
     public static int[] Iszero(int[] A) {
        int start = -1;
        int end = -2;
        int presum = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<A.length; i++) {
            presum += A[i];
            if (presum == 0) {
                start = 0;
                end = i;
            }
            else if(!hash.containsKey(presum)) hash.put(presum,i);
            else {
                if((i-hash.get(presum)) > (end - start+1)) {
                    start = hash.get(presum)+1;
                    end = i;
                } 
            }
            
        }
        if (start == -1) return new int[0];
        else return Arrays.copyOfRange(A, start, end+1);
    }
    public static void main(String[] args) {
        //int ar[]={-1, 20, 7, -22, 1, 21, 5, 24, -26, -16, -4, -9, 19, 8, -27, 28, 9, 8, -29, 29, 8, 9, 17, -28, 13, 20, -1, -8, -16};
        int ar[]={5,3,-3,4,0,0,-9,9};
        int res[]=Iszero(ar);
        for(int i: res)
            System.out.println(i);
    }
}
