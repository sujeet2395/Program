package Algorithms;

//Initial Template for Java
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.*;
import java.lang.*;
import java.io.*;

public class VerticalOrderTree {

    private static class Node {

        int data;
        Node left, right;

        Node(int key) {
            data = key;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            HashMap<Integer, Node> m = new HashMap<Integer, Node>();
            int n = sc.nextInt();
            Node root = null;
            while (n-- > 0) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);

                Node parent = m.get(n1);
                if (parent == null) {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null) {
                        root = parent;
                    }
                }
                Node child = new Node(n2);
                if (lr == 'L') {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
                m.put(n2, child);
            }

            verticalOrder(root);
            System.out.println();
        }
    }

    public static void verticalOrder(Node root) {
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<>();
        Map<Integer, List<Integer>> map=new HashMap();
        HashMap<Node, Integer> m = new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        preorder(root, q);
        //q.add(root);//can be done using level order travelsal also.
        m.put(root, 0);
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            if(temp.left!=null){
                m.put(temp.left, m.get(temp)-1);
                //q.add(temp.left);
                if(m.get(temp.left)<min)
                {
                    min=m.get(temp.left);
                }
            }
            if(temp.right!=null){
                m.put(temp.right, m.get(temp)+1);
                //q.add(temp.right);
                if(m.get(temp.right)>max)
                {
                    max=m.get(temp.right);
                }
            }
            if(map.containsKey(m.get(temp)))
            {
                List<Integer> verList=map.get(m.get(temp));
                verList.add(temp.data);
            }else{
                List<Integer> verList=new LinkedList<>();
                verList.add(temp.data);
                map.put(m.get(temp), verList);
            }
        }
        int i;
        for(i=min; i<=max; i++)
        {
            for(Integer data: map.get(i))
            {
                System.out.print(data+" ");
            }
        }
    }
    public static void preorder(Node root, Queue<Node> q)
    {
        if(root==null)
            return;
        q.add(root);
        preorder(root.left, q);
        preorder(root.right, q);
    }
}
