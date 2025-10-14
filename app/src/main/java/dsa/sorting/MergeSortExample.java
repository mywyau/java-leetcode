package dsa.sorting;

import java.util.Arrays;

// divide and conquer sorting

public class MergeSortExample {

    // Conquer phase
    private void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temp arrays
        int[] L = new int[n1]; // left - we create the array defining the size here.
        int[] R = new int[n2]; // right - we create the array defining the size here.

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge back logic
        int i = 0, j = 0, k = left; // initialise counters to try and keep track of indexes. i → index for left temp
                                    // array L, j → index for right temp array R, k → index for the main array (arr)

        while (i < n1 && j < n2) { // loop based on index counters until we get to the end of each subarray,
            if (L[i] <= R[j]) { // we are trying to sort the array, so left side will inherently be less than the right
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    // Main mergesort function

    // Base case: when left >= right, the subarray has 1 or 0 elements → already
    // sorted.
    // Divide step: find the middle index.
    // Recursive calls: sort the left and right halves.
    // Combine step: merge the two sorted halves with merge().

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid); // Sort first half
            mergeSort(arr, mid + 1, right); // Sort second half
            merge(arr, left, mid, right); // Merge sorted halves
        }
    }

    private void merge2(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }

    }

    public void mergeSort2(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort2(arr, left, mid);
            mergeSort2(arr,  mid + 1, right);
            merge2(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

        MergeSortExample ms = new MergeSortExample();

        ms.mergeSort2(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
        // [3, 9, 10, 27, 38, 43, 82]
    }
}
