
package leetcode.easy;

public class MergeStrings {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        // Loop through both strings until one is exhausted
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        // Add the rest of the characters if any
        while (i < word1.length()) {
            result.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            result.append(word2.charAt(j++));
        }

        return result.toString();
    }

    public String mergeAlternatelyTwoPointer(String word1, String word2) {
        StringBuilder merged = new StringBuilder();

        int ptr1 = 0; // pointer for word1
        int ptr2 = 0; // pointer for word2

        // Merge characters alternately
        while (ptr1 < word1.length() && ptr2 < word2.length()) {
            merged.append(word1.charAt(ptr1++));
            merged.append(word2.charAt(ptr2++));
        }

        // If word1 has leftover characters
        while (ptr1 < word1.length()) {
            merged.append(word1.charAt(ptr1++));
        }

        // If word2 has leftover characters
        while (ptr2 < word2.length()) {
            merged.append(word2.charAt(ptr2++));
        }

        return merged.toString();
    }

    public static void main(String[] args) {

        MergeStrings ms = new MergeStrings();

        System.out.println(ms.mergeAlternately("abc", "pqr")); // Output: apbqcr
        System.out.println(ms.mergeAlternately("ab", "pqrs")); // Output: apbqrs
        System.out.println(ms.mergeAlternately("abcd", "pq")); // Output: apbqcd
    }
}
