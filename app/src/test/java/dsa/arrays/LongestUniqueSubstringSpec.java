package dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dsa.arrays.sliding_window.LongestUniqueSubstring;

public class LongestUniqueSubstringSpec {

    @Test
    void testExamples() {
        LongestUniqueSubstring longestUniqueSubstring = new LongestUniqueSubstring();

        assertEquals(3, longestUniqueSubstring.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, longestUniqueSubstring.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, longestUniqueSubstring.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, longestUniqueSubstring.lengthOfLongestSubstring(""));
    }
}
