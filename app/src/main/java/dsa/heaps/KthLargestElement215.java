package dsa.heaps;

import java.util.PriorityQueue;

public class KthLargestElement215 {

    public int findKthLargestHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove the smallest to keep only k largest
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestElement215 s = new KthLargestElement215();
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 4;
        System.out.println(s.findKthLargestHeap(nums, k)); // 4
    }

}
