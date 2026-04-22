package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class NodeOfLinkedList {
    public static void main(String[] args) {
        // Node a = new Node();
        // a.val = 10;
        // Node b = new Node();
        // b.val = 20;
        // Node c = new Node();
        // c.val = 30;

        Node a = new Node(10);
        Node b = new Node(15);
        Node c = new Node(25);


        //connect karne k lie
        a.next = b;
        b.next = c;
    }
    
}
