package leetcode.easy.arrays.two_pointers;

public class MoveZeros {

    public int[] moveZeros(int[] nums) {

        int insertPos = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[insertPos] = nums[j];
                insertPos++;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }

        return nums;
    }

    public int[] moveZeros2(int[] nums) {
        int insertPos = 0;

        // First pass: move all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Second pass: fill the rest with zeros
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }

        return nums;
    }

}
