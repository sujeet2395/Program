package Algorithms;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {
    public static void main(String[] args) {
        Queue q=new LinkedList();
        int i;
        for(i=0; i<10; i++)
            q.add(i);
        
        System.out.println(q);
        Deque dq=new LinkedList();
        for(i=0; i<10; i++)
            if(i%2==0)
                dq.add(i);
            else
                dq.push(i);
        System.out.println(dq);
    }
}
