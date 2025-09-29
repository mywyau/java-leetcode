package dsa.two_pointers;

// Description:
// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters.
// Words are separated by at least one space.
// The result string should not contain leading or trailing spaces.
// Multiple spaces between words should be reduced to a single space.

public class ReverseWords151 {

    public String reverseWords(String s) {
        // Step 1: trim and split by spaces
        String[] words = s.trim().split("\\s+");

        // Step 2: reverse order
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0)
                sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String sentence1 = "the sky is blue";
        String sentence2 = "  hello   world  ";
        String sentence3 = "a good   example";

        ReverseWords151 solver = new ReverseWords151();

        System.out.println(solver.reverseWords(sentence1)); // blue is sky the
        System.out.println(solver.reverseWords(sentence2)); // world hello
        System.out.println(solver.reverseWords(sentence3)); // example good a

    }

}
