package Tree;

public class Node {
    int val;
    Node Left;
    Node Right;
    Node(int val){
        this.val=val;
        this.Left=null;
        this.Right=null;
    }
}

class Implementation {
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.Left); //left ki saari value print kar dega
        display(root.Right); // right ki saari value print kar dega
    }

    private static int size(Node root){
        if(root==null) return 0;
        int leftSize=size(root.Left);
        int rightSize=size(root.Right);
        return leftSize+rightSize+1; // +1 for current node
    }
    
    private static int sum(Node root){
        if(root==null) return 0;
        int leftSum=sum(root.Left);
        int rightSum=sum(root.Right);
        return leftSum+rightSum+root.val; // +1 for current node
    }

    private static int level(Node root){
        if(root==null) return 0;
        int leftLevel=level(root.Left);
        int rightLevel=level(root.Right);
        return Math.max(leftLevel, rightLevel)+1; // +1 for current node
    }

    public static void main(String[] args) {
        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4   5 6   7
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);   
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.Left=b;
        a.Right=c;  
        b.Left=d;
        b.Right=e;
        c.Left=f;
        c.Right=g;
        display(a);
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(level(a));
    }
}