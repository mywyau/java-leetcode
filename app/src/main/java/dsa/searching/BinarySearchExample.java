package dsa.searching;

// the array must be sorted

// O(1) - best time - when target is at mid point
// O(log n) - time
// O(1) - space

public class BinarySearchExample {

    public int binarySearch(int[] arr, int target) {

        // we want to use two pointers for this search - not the same as the two pointer technique
        int left = 0; // initialise left pointer - beginning of array
        int right = arr.length - 1; // initialise right pointer - end of array

        while (left <= right) {

            int mid = left + (right - left) / 2; // declare the mid point

            if (arr[mid] == target) {
                return mid; // we found the target in the middle of array
            } else if (arr[mid] < target) {
                left = mid + 1; // search left side, by bumping pointer +1
            } else {
                right = mid - 1; // move right pointer -1
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int target = 6;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // java lists initiates index at 0

        BinarySearchExample binarySearchExample = new BinarySearchExample();

        System.out.println("Found the target: " + target);
        System.out.println("At index: " + binarySearchExample.binarySearch(nums, target));

    }

}
