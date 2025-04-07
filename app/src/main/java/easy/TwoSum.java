package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static class Pair {
        int val;
        int index;
        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    public int[] twoSumTwoPointer(int[] nums, int target) {
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

    public int[] twoSumHashMap(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {}; // if no solution
    }
}
