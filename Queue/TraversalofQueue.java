package Queue;
import java.util.*;

public class TraversalofQueue {

    private static void displayQueue(Queue<Integer> q) {
        System.out.println("Traversal using for-each loop:");
        for (int element : q) {
            System.out.println(element); // Process the element (e.g., print it)
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); //or Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        
        // Traversal using for-each loop
        System.out.println("Traversal using for-each loop:");   
        int n = q.size();
        for (int i = 0; i < n; i++) {
            int element = q.poll(); // Remove the front element
            System.out.println(element); // Process the element (e.g., print it)
            q.add(element); // Add the element back to the rear of the queue
        }
    }

    
}
