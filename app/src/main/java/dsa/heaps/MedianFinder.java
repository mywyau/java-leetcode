package dsa.heaps;

import java.util.*;

/*
 * ============================
 * MedianFinder Summary
 * ============================
 * 
 * Purpose:
 * Efficiently track a stream of numbers and compute the median in real-time.
 * 
 * Core Components:
 * - Two Heaps:
 *   - Max-Heap (left): stores the smaller half of the numbers.
 *   - Min-Heap (right): stores the larger half of the numbers.
 * 
 * Invariants:
 * - All elements in left ≤ all elements in right.
 * - The size difference between the heaps is at most 1.
 * 
 * Median Logic:
 * - If both heaps are equal in size → median = average of tops.
 * - If left is larger → median = top of left.
 * 
 * Time Complexity:
 * - addNum: O(log n) due to heap operations.
 * - findMedian: O(1) by peeking at heap tops.
 * 
 * Space Complexity:
 * - O(n) for storing all numbers in the heaps.
 */



public class MedianFinder {

    // left: a max-heap that stores the smaller half of the numbers.
    // right: a min-heap that stores the larger half of the numbers.

    private PriorityQueue<Integer> left; // Max-heap
    private PriorityQueue<Integer> right; // Min-heap

    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());    // left uses Collections.reverseOrder() to behave like a max-heap.
        right = new PriorityQueue<>();                             // right is a regular min-heap.
    }

    public void addNum(int num) {
    
        left.offer(num); // Step 1: Add to max-heap
        right.offer(left.poll()); // Step 2: Balance - move largest from left to right

        
        if (left.size() < right.size()) { // Step 3: Maintain size property
            left.offer(right.poll()); // Rebalance if needed
        }
    }

    public double findMedian() {
        if (left.size() == right.size()) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return left.peek();
        }
    }

    public static void main(String[] args) {
        
        MedianFinder mf = new MedianFinder();

        int[] nums = { 5, 2, 10, 1, 3 };
        for (int num : nums) {
            mf.addNum(num);
            System.out.println("Added: " + num + ", Current Median: " + mf.findMedian());
        }
    }

}
