package leetcode.easy.arrays.two_pointers;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0; // edge case

        int write = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[write - 1]) {
                nums[write] = nums[i];
                write++;
            }
        }
        return write;
    }

}
