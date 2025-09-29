package dsa.two_pointers;

import java.util.Arrays;

/**
 * Problem: Remove duplicates from a sorted array in-place.
 *
 * Constraints / Assumptions:
 * - Input array MUST be sorted.
 * - The algorithm works in O(n) time and O(1) extra space.
 * - The function modifies the array in place and returns the
 * length of the unique portion (not a new array).
 *
 * Example:
 * nums = [0,0,1,1,2,2,3]
 * After: nums = [0,1,2,3,2,2,3], return 4
 * Valid part is nums[0..3] = [0,1,2,3].
 */

public class RemoveDuplicates {

    /**
     * Removes duplicates in-place using two pointers.
     *
     * @param nums Sorted array of integers.
     * @return The length of the unique portion.
     */

    public int removeDuplicates(int[] nums) {
        // 'slow' points to the last unique element found
        int slow = 0;

        // 'fast' scans ahead to find new unique elements
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++; // move boundary forward
                nums[slow] = nums[fast]; // copy unique element
            }
        }

        // length of unique subarray is (last index + 1)
        return slow + 1;
    }

    public static void main(String args[]) {
        // Must provide a sorted array!
        int[] numsWithDuplicates = { 0, 0, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };

        RemoveDuplicates solver = new RemoveDuplicates();

        System.out.println("Numbers before: " + Arrays.toString(numsWithDuplicates));

        int uniqueLength = solver.removeDuplicates(numsWithDuplicates);

        System.out.println("Unique length: " + uniqueLength);

        // Only the first 'uniqueLength' elements are guaranteed to be unique
        System.out.println("Numbers after: " + Arrays.toString(Arrays.copyOf(numsWithDuplicates, uniqueLength)));
    }
}
