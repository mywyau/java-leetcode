package dsa.sliding_window.fixed;

import java.util.Arrays;

// Count of Subarrays of Size K with Average ≥ Threshold (LeetCode 1343)

 // k = 3

public class AverageOfSubarrayOverThreshold {

    public int averageOfSubarrayOverThreshold(int[] nums, int k, int threshold) {

        int windowSum = 0;
        int count = 0;

        // create first sub array
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        if (windowSum / k >= threshold) {
            count++;
        }
        
        // iterate over array startring from end of first sub array since we already calculated the value earlier
        for (int end = k; end < nums.length; end++) {
            windowSum += nums[end] - nums[end - k];
            if (windowSum / k >= threshold)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
                        
        int[] nums = { 2, 3, 1, 2, 4, 3, 6, 5, 2, 8, 9 };

        int threshold = 3;

        AverageOfSubarrayOverThreshold averageOfSubarrayOverThreshold = new AverageOfSubarrayOverThreshold();

        System.out.print("\nArray: " + Arrays.toString(nums));
        System.out.print("\nTreshold: " + threshold);

        int result = averageOfSubarrayOverThreshold.averageOfSubarrayOverThreshold(nums, 3, threshold);

        System.out.print("\nResult " + result);
    }

}
