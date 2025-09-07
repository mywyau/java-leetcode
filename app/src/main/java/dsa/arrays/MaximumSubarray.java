package dsa.arrays;

// Naive Approach (Brute Force)
// Check all possible subarrays.
// Compute sum of each.
// Return maximum.
// ⏱ Time complexity: O(n²) or even O(n³) → too slow for interviews.

// 📌 Kadane’s Algorithm (Optimal O(n))

// Key insight:
// Either extend the current subarray or start fresh at the current element.
// At each index:
//     currMax = max(nums[i], currMax + nums[i])
//     globalMax = max(globalMax, currMax)

// So:
//     currMax tracks the best sum ending here.
//     globalMax tracks the best sum seen so far.

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int currMax = nums[0]; // best sum ending at index 0
        int globalMax = nums[0]; // best sum overall

        for (int i = 1; i < nums.length; i++) {
            // Either start new subarray at nums[i] or extend previous
            currMax = Math.max(nums[i], currMax + nums[i]);
            globalMax = Math.max(globalMax, currMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        MaximumSubarray solver = new MaximumSubarray();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Max Subarray Sum = " + solver.maxSubArray(nums));
        // Output: 6
    }
}
