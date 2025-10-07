package dsa.sliding_window.fixed;

import java.util.Random;

public class MaxSumSubarray {

    public int maxSumSubarray2BruteForce(int[] nums, int k) {
        int maxSum = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // Fixed sliding window algorithm, basically improved brute force

    public int maxSumSubarray(int[] nums, int k) {

        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;

        for (int end = k; end < nums.length; end++) {
            windowSum += nums[end] - nums[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    private static int[] generateLargeArray(int size) {
        Random rand = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = rand.nextInt(100); // values from 0 to 99
        }
        return result;
    }

    public static void main(String[] args) {

        MaxSumSubarray maxSum = new MaxSumSubarray();

        int[] nums = generateLargeArray(1_000_000); // try with 1M elements
        int k = 500;

        // Brute Force Timing
        long startBrute = System.nanoTime();
        int bruteResult = maxSum.maxSumSubarray2BruteForce(nums, k);
        long endBrute = System.nanoTime();
        System.out.println("Brute Force Result: " + bruteResult);
        System.out.println("Brute Force Time: " + ((endBrute - startBrute) / 1_000_000.0) + " ms");

        // Sliding Window Timing
        long startSliding = System.nanoTime();
        int slidingResult = maxSum.maxSumSubarray(nums, k);
        long endSliding = System.nanoTime();
        System.out.println("Sliding Window Result: " + slidingResult);
        System.out.println("Sliding Window Time: " + ((endSliding - startSliding) / 1_000_000.0) + " ms");
    }
}

// > Task :app:MaxSumSubarray
// Brute Force Result: 27414
// Brute Force Time: 96.437334 ms

// Sliding Window Result: 27414
// Sliding Window Time: 2.559958 ms
