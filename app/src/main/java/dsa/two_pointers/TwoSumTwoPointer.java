package dsa.two_pointers;

import java.util.Arrays;
import java.util.Comparator;

public class TwoSumTwoPointer {

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
                return new int[] { pairs[left].index, pairs[right].index };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {}; // no solution
    }

    public static void main(String[] args) {
        TwoSumTwoPointer twoSum = new TwoSumTwoPointer();
        int target = 10;
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] idx = twoSum.twoSumTwoPointer(numbers, target); // e.g. [3, 5]
        System.out.println("Indices: " + Arrays.toString(idx)); // prints [3, 5]

        // now fetch and print the values:
        if (idx.length == 2) {
            int a = numbers[idx[0]];
            int b = numbers[idx[1]];
            System.out.printf("Numbers: %d + %d = %d%n", a, b, target);
        }
    }

}
