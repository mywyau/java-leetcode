package easy;

import java.util.*;

public class TwoSum {

    static class Pair {
        int val;
        int index;
        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Pair[] pairs = new Pair[n];

        // Step 1: Store value and original index
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(nums[i], i);
        }

        // Step 2: Sort by value
        Arrays.sort(pairs, Comparator.comparingInt(p -> p.val));

        // Step 3: Two-pointer approach
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = pairs[left].val + pairs[right].val;
            if (sum == target) {
                return new int[]{pairs[left].index, pairs[right].index};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{}; // no solution
    }
}
