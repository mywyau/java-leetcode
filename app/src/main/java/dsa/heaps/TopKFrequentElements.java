package dsa.heaps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// We want to return 2 most frequently appearing numbers in our array

// Input: nums = [1, 1, 1, 2, 2, 3], k = 2  
// Output: [1,2] 

// Counting: O(n)
// Heap operations: O(n log k)
// Total: O(n log k)


public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a min-heap to keep top k elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove the least frequent
            }
        }

        // Step 3: Extract the keys from the heap
        int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            result[i++] = minHeap.poll().getKey();
        }

        return result;
    }
}


// Why Use a Min-Heap?
// ✅ Reason 1: Efficiently Track Top K Elements
// A min-heap helps us keep only the top k elements based on frequency.

// The heap is ordered by frequency.
// When the heap size exceeds k, we remove the least frequent element.
// This ensures that the heap always contains the k most frequent elements.

// ✅ Reason 2: Better Than Sorting
// If we sort all elements by frequency, it takes O(n log n) time.
// Using a min-heap of size k:

// We insert n elements into the heap.
// Each insert/remove takes O(log k) time.
// Total time: O(n log k) — much faster when k is small compared to n.

// We could sort or use max-heap instead of min-heap but would be more inefficient


