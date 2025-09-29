package dsa.sliding_window.variable;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinctCharacters {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        int left = 0;
        int maxLen = 0;

        Map<Character, Integer> count = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
        
            count.put(c, count.getOrDefault(c, 0) + 1);

            // shrink window if too many distinct chars
            while (count.size() > k) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                if (count.get(leftChar) == 0) {
                    count.remove(leftChar);
                }
                left++;
            }

            int windowLen = right - left + 1;
            maxLen = Math.max(maxLen, windowLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringKDistinctCharacters solver = new LongestSubstringKDistinctCharacters();
        String s = "eceba";
        int k = 2;

        System.out.println("Input: " + s + ", k=" + k);
        System.out.println("Result: " + solver.lengthOfLongestSubstringKDistinct(s, k));
    }
}

