package dsa.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    // bad
    // Time: O(n²)
    // Space: O(1)

    public boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // Optimal Solution: Use a HashSet
    // 💡 Why HashSet?
    // A Set only stores unique elements — if we try to add a duplicate, we know it
    // already exists.

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        ContainsDuplicate217 containsDuplicate217 = new ContainsDuplicate217();

        System.out.println(containsDuplicate217.containsDuplicateSort(nums1)); // true
        System.out.println(containsDuplicate217.containsDuplicateSort(nums2)); // false
        System.out.println(containsDuplicate217.containsDuplicateSort(nums3)); // true
    }

}
