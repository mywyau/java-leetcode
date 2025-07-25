package leetcode.medium;

import java.util.HashSet;

// Key Idea: Sliding Window
// We use a window (a range of characters) and move it along the string while keeping track of:

// - Characters we've seen
// - The current substring's start index
// - The longest length so far

// Time & Space Complexity
// Time: O(n) – each character is seen at most twice.

// Space: O(min(n, m)) – where m is the size of the character set.

//  +++++++ How It Works (Step-by-Step with "abcabcbb") +++++++
//    - left = 0, right expands forward
//    - We use a HashSet to track characters in the current window
//    - If a repeat character is found:
//    - Shrink the window from the left until the duplicate is removed
//    - Keep track of the max window size


public class LongestSubstring {



    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // Shrink the window until no duplicates
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
