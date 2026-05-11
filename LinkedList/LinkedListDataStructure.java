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
    int size = 0;

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null){
            head = tail = temp ;
        }else{
            tail.next = temp;
            tail = temp;
            size++;
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
            size++;
        }
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("Linked List is empty");
        }else{
            head = head.next;
            size--;
        }
    }

    void insertAtPosition(int idx , int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid index");
        }
        else if(idx==0){
            addAtHead(val);
        }else if(idx==size){
            addAtTail(val);
        }else{
            Node temp = head;
            for(int i = 0 ; i<=idx-1 ; i++){
                temp = temp.next;
            }
            Node t  = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    void deleteAtPosition(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid index");
        }
        else if(idx==0){
            deleteAtHead();
        }else{
            Node temp = head;
            for(int i = 0 ; i<idx-1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
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
        ll.insertAtPosition(3, 15);
        ll.Display();
    }
    
}
