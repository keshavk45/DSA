package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class DisplayLinkedList {

    public static void recursiveDisplay(Node head){
        if(head == null) return;
        System.out.print(head.val + " ");
        recursiveDisplay(head.next);
    }

    public static void display(Node head){
        // Node temp = head;
        // while(temp != null){
        //     System.out.print(temp.val + " ");
        //     temp = temp.next;
        // }

        for(Node temp = head ; temp!=null ; temp = temp.next){
            System.out.print(temp.val + " ");
        }

    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(15);
        Node c = new Node(25);


        //connect karne k lie
        a.next = b;
        b.next = c;
        // display(a);
        recursiveDisplay(a);
    }
    
}
