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



public class DoublyLinkedList{
    public static void main(String[] args) {
        
    }
}