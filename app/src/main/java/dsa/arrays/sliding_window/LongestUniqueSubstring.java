package dsa.arrays.sliding_window;

import java.util.HashSet;
import java.util.Set;

// Time: O(n) — each character is visited at most twice (once added, once removed)
// Space: O(k) — where k is the number of unique characters in the string (at most 26 or 128 depending on char set)

public class LongestUniqueSubstring {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> seen = new HashSet<>();  // Keeps track of unique characters in the current window. 

        int maxLen = 0;  // stores the longest valid substring length. 
        int start = 0; // left boundary of the window.

        for (int end = 0; end < s.length(); end++) {  // end is the right boundary of the window.
            char rightChar = s.charAt(end);  // We expand the window by adding rightChar.

            while (seen.contains(rightChar)) {
                seen.remove(s.charAt(start));
                start++;
            }

            seen.add(rightChar); // Add the current character to the window.
            maxLen = Math.max(maxLen, end - start + 1);  // Update maxLen with the current window length if it's longer.
        }

        return maxLen;
    }

}
