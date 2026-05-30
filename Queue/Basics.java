package Queue;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); //or Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q); // Output: [1, 2, 3]
        System.out.println(q.size()); // Output: 3
        System.out.println(q.peek()); // Output: 1 (front element)
        System.out.println(q.poll()); // Output: 1 (removes front element)
        System.out.println(q.size()); // Output: 2
        System.out.println(q); // Output: [2, 3]
    }
}