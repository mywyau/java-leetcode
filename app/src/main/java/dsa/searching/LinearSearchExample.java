package dsa.searching;

public class LinearSearchExample {

    public int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int target = 999;

        int[] nums = { 5, 3, 2, 1, 5, 3, 10, 999 };

        LinearSearchExample linearSearchExample = new LinearSearchExample();

        System.out.println("Found target: " + target + "\nAt index: " + linearSearchExample.linearSearch(nums, target));
    }
}
