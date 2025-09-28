package dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dsa.sliding_window.variable.LongestSubstringNoRepeat3;;

public class LongestSubstringNoRepeat3Spec {

    @Test
    void testExamples() {

        LongestSubstringNoRepeat3 solver = new LongestSubstringNoRepeat3();

        assertEquals(3, solver.lengthOfLongestSubstringHashSet("abcabcbb"));
        assertEquals(1, solver.lengthOfLongestSubstringHashSet("bbbbb"));
        assertEquals(3, solver.lengthOfLongestSubstringHashSet("pwwkew"));
        assertEquals(0, solver.lengthOfLongestSubstringHashSet(""));
    }
}
