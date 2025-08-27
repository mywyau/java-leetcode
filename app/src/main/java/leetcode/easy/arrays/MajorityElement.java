package leetcode.easy.arrays;

public class MajorityElement {

    // Problem 169

    // Boyer-Moore Voting Algorithm (Best in-place)

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
