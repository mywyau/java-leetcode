package dsa.stacks_and_queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    // Common Operations
    // Add to queue	queue.add(value)	Adds to the back (throws if full)
    // Offer to queue	queue.offer(value)	Adds to the back (returns false if full)
    // Remove from front	queue.remove()	Removes head (throws if empty)
    // Poll from front	queue.poll()	Removes head (returns null if empty)
    // Peek at front	queue.peek()	Reads head without removing

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("Alice");
        q.add("Bob");
        q.add("Charlie");

        System.out.println(q.peek()); // Alice
        System.out.println(q.poll()); // Alice
        System.out.println(q.poll()); // Bob
        System.out.println(q.poll()); // Charlie
        System.out.println(q.poll()); // null (empty)
    }


    

}
