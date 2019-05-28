package DataStructures;

public class BinaryTreeToDLL {
    static Node head=null;
    public static void btToDLL(Node root) {
        if(root==null)
            return;
        btToDLL(root.right);
        root.right=head;
        if(head!=null)
            head.left=root;
        head=root;
        btToDLL(root.left);
    }
    public static void printDLL(Node head)
    {
        Node te=head;
        while(te!=null)
        {
            System.out.println(te.data+" ");
            te=te.right;
        }
    }
    public static void main(String[] args) {
        //Node head=null;
        Node root=new Node(3);
        root.left=new Node(2);
        root.right=new Node(4);
        root.left.left=new Node(1);
        root.left.right=new Node(0);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        btToDLL(root);
        printDLL(head);
    }
    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left=null;
            right=null;
        }
    }
}
