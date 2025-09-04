package dsa.heaps;

import java.util.*;

public class HeapExample {
    
    public static void main(String[] args) {
        // Min-Heap (default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);

        System.out.println("Min-Heap root: " + minHeap); // Min-Heap root: [5, 10, 20]
        System.out.println("Min-Heap root: " + minHeap.peek()); // 5

        // Max-Heap (custom comparator)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());   //to get the max heap we just reverse the min heap order instead 
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);

        System.out.println("Max-Heap root: " + maxHeap); // 20 Max-Heap root: [20, 5, 10]
        System.out.println("Max-Heap root: " + maxHeap.peek()); // 20
    }
}
