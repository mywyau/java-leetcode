package neetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringExample {

    public int longestSubstring(String str) {

        Map<Character, Integer> seen = new HashMap<>();
        int left = 0;
        int max_len = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (seen.containsKey(c) && seen.get(c) >= left) {
                left = seen.get(c) + 1;
            }
            seen.put(c, i);
            max_len = Math.max(max_len, i - left + 1);
        }
        return max_len;
    }

    public static void main(String[] args) {

        LongestSubstringExample longestSubstringExample = new LongestSubstringExample();
        System.out.println(longestSubstringExample.longestSubstring("abcabcbb")); // 3
        System.out.println(longestSubstringExample.longestSubstring("bbbbb")); // 1
        System.out.println(longestSubstringExample.longestSubstring("pwwkew")); // 3¬
    }
}
