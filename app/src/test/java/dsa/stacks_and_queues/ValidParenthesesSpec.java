package dsa.stacks_and_queues;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidParenthesesSpec {

    @Test
    void testValidCases() {
        ValidParentheses checker = new ValidParentheses();
        assertTrue(checker.isValid("()"));
        assertTrue(checker.isValid("()[]{}"));
        assertTrue(checker.isValid("{[]}"));
    }

    @Test
    void testInvalidCases() {
        ValidParentheses checker = new ValidParentheses();
        assertFalse(checker.isValid("(]"));
        assertFalse(checker.isValid("([)]"));
        assertFalse(checker.isValid("]"));
    }
}
