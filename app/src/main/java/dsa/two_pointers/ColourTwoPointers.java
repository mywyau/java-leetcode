package dsa.two_pointers;

import java.util.*;

class ColourTwoPointers {
    public static int[] sortColors(int[] colors) {

        int left = 0;
        int right = colors.length - 1;
        int current = 0;
        
        while (current <= right) {

            if (colors[current] == 0) {
                int temp = colors[left];
                colors[left] = colors[current];
                colors[current] = temp;
                
                current++;
                left++;
            }

            else if (colors[current] == 1) {
                current++;
            }

            else {
                
                int temp = colors[current];
                colors[current] = colors[right];
                colors[right] = temp;

                right--;
            }
        }

        return colors;
    }

    // Driver code
    public static void main(String[] args) {

        int[][] inputs = {
            {0, 1, 0},
            {1, 1, 0, 2},
            {2, 1, 1, 0, 0},
            {2, 2, 2, 0, 1, 0},
            {2, 1, 1, 0, 1, 0, 2}
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tcolors: " + Arrays.toString(inputs[i]));

            int[] sortedColors = sortColors(inputs[i].clone());
            System.out.println("\n\tThe sorted array is: " + Arrays.toString(sortedColors));

            // System.out.println(Print.repeat("-", 100));
        }
    }
}
