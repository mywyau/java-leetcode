package dsa.sorting;

// Insertion Sort works like sorting playing cards in your hands:

// Start with the first card — it’s already “sorted”.
// Pick up the next card.
// Insert it into its correct position among the cards you’ve already sorted.
// Repeat until all cards are sorted.

// It’s simple, stable, and great for small or nearly sorted arrays.

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) { // start from index 1
            
            int key = arr[i]; // current element to insert
            int j = i - 1; // compare with previous elements

            // shift elements greater than key to one position right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place key in correct position
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
