package leetcode.easy;

public class LongestCommonPrefix {


    // Vertical Scanning
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Loop over each character of the first word
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            // Compare with all other strings at index i
            for (int j = 1; j < strs.length; j++) {
                // If out of bounds or characters differ → stop
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // All characters matched in first string
        return strs[0];
    }
}
