package dsa.sliding_window.variable;

import java.util.Arrays;

// Question:
// Given a binary array nums and an integer k, return the length of the longest subarray containing at most k zeros.

public class MaximumConsecutiveOnesIII1004 {

    public int maximumConsecutiveOnesIII(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            // shrink window if too many zeros
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            int windowLen = right - left + 1;
            maxLen = Math.max(maxLen, windowLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        MaximumConsecutiveOnesIII1004 solver = new MaximumConsecutiveOnesIII1004();
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;

        System.out.println("Nums = " + Arrays.toString(nums));
        System.out.println("\nk = " + k);
        int result = solver.maximumConsecutiveOnesIII(nums, k);
        System.out.println("\nResult = " + result + " → This means the longest streak of 1s (if we flip at most " + k + " zeros) has length " + result + ".");
    }
}