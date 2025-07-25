package leetcode.easy;

import java.util.Stack;

// Given a string s containing just the characters '(', ')', '{', '}', '[', and ']', determine if the input string is valid.

// Key Idea: Use a Stack
// We use a stack to track opening brackets. Every time we see a closing bracket, we check if it matches the top of the stack.

// Time: O(n) — one pass through the string
// Space: O(n) — in worst case all characters are opening brackets

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If stack is empty or top doesn't match, return false
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // At the end, stack should be empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        ValidParentheses checker = new ValidParentheses();

        // Test cases
        String[] testInputs = { "()", "()[]{}", "(]", "([)]", "{[]}", "", "((((()))))", "{[()()]}" };

        for (String input : testInputs) {
            boolean result = checker.isValid(input);
            System.out.println("Input: \"" + input + "\" -> " + result);
        }
    }
}
