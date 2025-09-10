package dsa.sorting;

import java.util.Arrays;

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

    public static void main(String[] args) {

        QuickSortExample qs = new QuickSortExample();

        int[] arr = { 6, 3, 8, 5, 2, 7, 4, 1 };
        int[] sorted = qs.quickSort(arr); // ✅ assign the returned sorted array

        System.out.println("Original: " + Arrays.toString(arr)); // original array (now sorted in-place)
        System.out.println("Sorted: " + Arrays.toString(sorted)); // sorted array (same as arr)
    }

}
