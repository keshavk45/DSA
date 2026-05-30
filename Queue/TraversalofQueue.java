package Queue;
import java.util.*;

public class TraversalofQueue {

    private static void addAtIndex(Queue<Integer> q, int index, int element) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            int currentElement = q.poll(); // Remove the front element
            if (i == index) {
                q.add(element); // Add the new element at the specified index
            }
            q.add(currentElement); // Add the current element back to the rear of the queue
        }
    }

    private static void removeAtIndex(Queue<Integer> q, int index) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            int currentElement = q.poll(); // Remove the front element
            if (i != index) {
                q.add(currentElement); // Add the current element back to the rear of the queue
            }
            // If i == index, we skip adding the element back, effectively removing it
        }
    }

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
