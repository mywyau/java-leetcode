package dsa.two_pointers.variations;

import java.util.Arrays;

// “Left–Right pointers”

// Used when the array is sorted or needs comparison from both ends
// Common problems:
// Two Pointer
// Palindrome Checks
// Trapping water, container with most water

public class OppositeEndsTwoPointers {

    // Two Sum II (Sorted Input)

    // Given a sorted integer array nums and an integer target,
    // find two numbers that add up to target.
    //
    // Return their indices (1-based for LeetCode, 0-based for general use).
    // You can assume exactly one valid pair exists.

    // This is not for regular Two Sum - when UNSORTED use a HashMap to remember the numbers seen previously.

    public static int[] twoSumSorted(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 }; // no valid pair found
    }

    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSumSorted(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
        System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
    }

}
