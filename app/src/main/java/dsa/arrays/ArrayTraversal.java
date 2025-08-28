package dsa.arrays;

public class ArrayTraversal {

    public int findMax(int[] nums) {

        int max = Integer.MIN_VALUE; // setting max to the int minimum value to to ensure any number is greater than
                                     // the minimum

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public int findMin(int[] nums) {

        int min = Integer.MAX_VALUE; // setting min to the int maximum value to to ensure any number is smaller than
                                     // the maximum possible value as we loop through

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public int sum(int[] nums) {

        int acc = 0;

        for (int num : nums) {
            acc += num;
        }

        return acc;
    }

    public int numberOfEvens(int[] nums) {

        int counter = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }
}