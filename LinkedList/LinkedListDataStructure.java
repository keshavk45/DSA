package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class LinkedList{
    Node head; //by default starting me null hi hoga
    Node tail; //by default starting me null hi hoga

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null){
            head = tail = temp ;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }

    void Display(){
        if(head==null){
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail = temp ;
        }else{
            temp.next = head;
            head = temp;
        }
    }

}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtHead(5);
        ll.Display();
    }
    
}
