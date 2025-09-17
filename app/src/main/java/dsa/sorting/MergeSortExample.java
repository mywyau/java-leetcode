package dsa.sorting;

import java.util.Arrays;

public class MergeSortExample {

    private void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge back
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
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
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            mergeSort(arr, left, mid);          // Sort first half
            mergeSort(arr, mid + 1, right);     // Sort second half
            merge(arr, left, mid, right);       // Merge sorted halves
        }
    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        MergeSortExample ms = new MergeSortExample();
        ms.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        // [3, 9, 10, 27, 38, 43, 82]
    }
}

