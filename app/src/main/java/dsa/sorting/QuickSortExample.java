package dsa.sorting;

import java.util.Arrays;

public class QuickSortExample {

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private int partition(int arr[], int left, int right) {

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

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    // Demo
    public static void main(String[] args) {
        QuickSortExample qs = new QuickSortExample();
        int[] arr = { 6, 3, 8, 5, 2, 7, 4, 1 };
        qs.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // [1,2,3,4,5,6,7,8]
    }
}
