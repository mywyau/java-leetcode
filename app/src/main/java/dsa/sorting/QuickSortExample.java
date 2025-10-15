package dsa.sorting;

import java.util.Arrays;
import java.util.Stack;

// Quick Sort is a divide and conquer algorithm:

// Average Time Complexity: O(n log n)
// Space Complexity: O(log n) (due to recursion)
// Efficient for large arrays (up to 50,000 elements)

public class QuickSortExample {

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    // Internal recursive method
    private void quickSortRecursive(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSortRecursive(arr, left, pivotIndex - 1);
            quickSortRecursive(arr, pivotIndex + 1, right);
        }
    }

    // Public method with no left/right
    public int[] quickSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return arr;
        quickSortRecursive(arr, 0, arr.length - 1);
        return arr;
    }

    // Both recursive and iterative (non-recursive) QuickSort algorithms:

    // Have the same time complexity:
    // Average: O(n log n)
    // Worst: O(n²)
    // Have the same space complexity asymptotically: O(log n)

    // But how that space is used is different.
    // The only real difference is:
    // The recursive version uses the call stack for subproblems.
    // The iterative version uses an explicit stack (Stack<int[]>) you manage
    // manually.

    // They perform identically in logic and output.
    // The iterative one just makes the recursion explicit.

    public int[] quickSortIterative(int[] arr) {

        if (arr == null || arr.length < 2)
            return arr;

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] { 0, arr.length - 1 });

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int left = range[0];
            int right = range[1];

            if (left < right) {
                int pivotIndex = partition(arr, left, right);
                stack.push(new int[] { left, pivotIndex - 1 });
                stack.push(new int[] { pivotIndex + 1, right });
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        QuickSortExample qs = new QuickSortExample();

        int[] arr = { 6, 3, 8, 5, 2, 7, 4, 1 };
        int[] sorted = qs.quickSort(arr); // ✅ assign the returned sorted array

        System.out.println("Original: " + Arrays.toString(arr)); // original array (now sorted in-place)
        System.out.println("Sorted: " + Arrays.toString(sorted)); // sorted array (same as arr)
    }

}
