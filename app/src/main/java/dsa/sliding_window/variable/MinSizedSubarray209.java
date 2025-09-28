package dsa.sliding_window.variable;

import java.util.Arrays;

// Problem:
// Given an array of positive integers nums and a positive integer target, 
// return the minimal length of a contiguous subarray of which the sum is greater than or equal to target.
// If there is no such subarray, return 0 instead.


public class MinSizedSubarray209 {

    public int minSizedSubarray(int[] nums, int target) {

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // shrink while valid
            while (sum >= target) {
                int windowLen = right - left + 1;
                minLen = Math.min(minLen, windowLen);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {

        MinSizedSubarray209 solver = new MinSizedSubarray209();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);

        int result = solver.minSizedSubarray(nums, target);

        System.out.println("Result = " + result);
    }
}
