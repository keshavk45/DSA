package LinkedList;
class ListNode{

    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }


}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head==null){
            head = tail = temp;
        }else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size ++;
    }

    void inserAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head==null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;

        }
        size++;
    }

    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayReverse(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();

    
    }

    void deleteAtHead(){
        if(size==0){
            System.out.println("List is empty");
        }else if(size==1){
            head = tail = null;
            size--;
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }

        void deleteAtTail(){
            if(size==0){
                System.out.println("List is empty");
            }else if(size==1){
                head = tail = null;
                size--;
            }else{
                tail = tail.prev;
                tail.next = null;
                size--;
            }
        }

        void insertAtPosition(int pos, int val){
            if(pos<1 || pos>size+1){
                System.out.println("Invalid position");
                return;
            }
            if(pos==1){
                insertAtHead(val);
                return;
            }
            if(pos==size+1){
                inserAtTail(val);
                return;
            }
            ListNode temp = new ListNode(val);
            ListNode curr = head;
            for(int i=1; i<pos-1; i++){
                curr = curr.next;
            }
            temp.next = curr.next;
            temp.prev = curr;
            curr.next.prev = temp;
            curr.next = temp;
            size++;
        }


}


public class DoublyLinkedList{
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);
        dll.inserAtTail(40);
        dll.inserAtTail(50);
        dll.display();
        dll.displayReverse();
        
    }
}