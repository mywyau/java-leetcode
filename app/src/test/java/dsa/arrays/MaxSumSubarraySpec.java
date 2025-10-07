package dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dsa.sliding_window.fixed.MaxSumSubarray;

public class MaxSumSubarraySpec {

    @Test
    void testMaxSum() {
        MaxSumSubarray mss = new MaxSumSubarray();
        int[] nums = { 2, 1, 5, 1, 3, 2 };
        assertEquals(9, mss.maxSumSubarray(nums, 3));
    }

    @Test
    void testMaxSum2() {
        MaxSumSubarray mss = new MaxSumSubarray();
        int[] nums = { 2, 1, 5, 1, 3, 2 };
        assertEquals(9, mss.maxSumSubarray2BruteForce(nums, 3));
    }
}
