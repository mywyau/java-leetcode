package dsa.hash_set;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    // bad
    // ❌ Time: O(n²)
    // ❌ Space: O(1)

    public boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    // Optimal Solution: Use a HashSet
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

}
