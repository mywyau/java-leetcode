package dsa.sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        
        int[] numbers = { 5, 3, 4, 1, 2 };

        System.out.println("Before sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        insertionSort(numbers);

        System.out.println("\nAfter sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
