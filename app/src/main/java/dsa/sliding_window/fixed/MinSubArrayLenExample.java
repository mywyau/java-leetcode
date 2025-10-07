package dsa.sliding_window.fixed;

import java.util.Arrays;

class MinSubArrayLenExample {

    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int window_sum = 0;
        int min_len = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            window_sum += nums[right];
            while (window_sum >= target) {
                min_len = Math.min(min_len, right - left + 1);
                window_sum -= nums[left];
                left += 1;
            }
        }
        if (min_len == Integer.MAX_VALUE) {
            return 0;
        } else {
            return min_len;
        }
    }

    public static void main(String[] args) {

        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;

        MinSubArrayLenExample minSubArrayLenExample = new MinSubArrayLenExample();

        System.out.print("\nArray: " + Arrays.toString(nums));
        System.out.print("\nTarget: " + target);

        int result = minSubArrayLenExample.minSubArrayLen(target, nums);

        System.out.print("\nResult " + result);
    }

}