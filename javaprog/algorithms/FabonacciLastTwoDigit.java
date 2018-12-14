package Algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FabonacciLastTwoDigit {
    
    public static void main(String[] args) {
        int t, n, fab=0, i, l, temp;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        List<Integer> list=new LinkedList<>();
        list.add(0);
        list.add(1);
        list.add(1);
        while(t-->0)
        {
            n=sc.nextInt();
            if(n>=0){
                if(n==0 || n==1 || n==2)
                {
                    fab=list.get(n);
                }else {
                    l=list.size();
                    if(n>(l-1))
                    {
                        for(i=l; i<=n; i++)
                        {
                            temp=(list.get(i-1)+list.get(i-2))%100;
                            list.add(i, temp);
                        }
                    }
                    fab=list.get(n);
                }
                System.out.println(fab);
            }
        }
    }
}
