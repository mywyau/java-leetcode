package dsa.sliding_window.variable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringNoRepeat3 {

    public int lengthOfLongestSubstringHashMap(String s) {

        int left = 0;
        int maxLen = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c)) {
                // shrink left to skip duplicate
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);

            int windowLen = right - left + 1;
            maxLen = Math.max(maxLen, windowLen);
        }

        return maxLen;
    }

    // Set is easier to remember 

    public int lengthOfLongestSubstringHashSet(String s) {

        Set<Character> seen = new HashSet<>(); // Keeps track of unique characters in the current window.

        int maxLen = 0; // stores the longest valid substring length.
        int start = 0; // left boundary of the window.

        for (int end = 0; end < s.length(); end++) { // end is the right boundary of the window.
            char rightChar = s.charAt(end); // We expand the window by adding rightChar.

            while (seen.contains(rightChar)) {
                seen.remove(s.charAt(start));
                start++;
            }

            seen.add(rightChar); // Add the current character to the window.
            maxLen = Math.max(maxLen, end - start + 1); // Update maxLen with the current window length if it's longer.
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringNoRepeat3 solver = new LongestSubstringNoRepeat3();
        String s = "abcabcbb";
        System.out.println("Input: " + s);
        int result = solver.lengthOfLongestSubstringHashMap(s);
        System.out.println("Result = " + result);
    }
}