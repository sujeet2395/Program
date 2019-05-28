package DataStructures;

public class LinkedListReverse {
    
    public static Node reverse(Node head) {
        if(head==null || head.next==null)
            return head;
        Node p=null, cur=head, nexts;
        while(cur!=null)
        {
            nexts=cur.next;
            cur.next=p;
            p=cur;
            cur=nexts;
        }
        head=p;
        return head;
    }
    public static void printReverse(Node head){
        if(head==null)
            return;
        printReverse(head.next);
        System.out.print(head.data + " ");
    }
    public static Node reverse(Node prev, Node cur)
    {
        Node head=null;
        if(cur!=null){
            head=reverse(cur,cur.next);
            cur.next=prev;
        }else{
            head=prev;
        }
        return head;
    }
    public static void printLastKnodeInReverse(Node head, int k) {
        if(head==null)
           return;
        Node t;
        t=head;
        int c=0;
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        if(c==k)
        {
            printReverse(head);
        }else if(c>k){
            t=head;
            int i=0;
            while(i<(c-k))
            {
                t=t.next;
                i++;
            }
            printReverse(t);
        }else{
            System.out.println("none");
        }
    }
    public static void print(Node head) {
        if(head==null)
            return;
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        //Node h=reverse(head);
        //print(h);
        
        //printLastKnodeInReverse(head, 3);
        
        Node h=reverse(null,head);
        print(h);
        
    }
    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
        
    }
}
