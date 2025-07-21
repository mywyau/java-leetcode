package leetcode;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import leetcode.easy.TwoSum;

public class TwoSumSpec {

    TwoSum solver = new TwoSum();

    @Nested
    class TwoPointerApproachTests {

        @Test
        public void testExample1() {
            int[] result = solver.twoSumTwoPointer(new int[]{2, 7, 11, 15}, 9);
            assertArrayEquals(new int[]{0, 1}, result);
        }

        @Test
        public void testNegativeNumbers() {
            int[] result = solver.twoSumTwoPointer(new int[]{-3, 4, 3, 90}, 0);
            assertArrayEquals(new int[]{0, 2}, result);
        }
    }

    @Nested
    class HashMapApproachTests {

        @Test
        public void testExample1() {
            int[] result = solver.twoSumHashMap(new int[]{2, 7, 11, 15}, 9);
            assertArrayEquals(new int[]{0, 1}, result);
        }

        @Test
        public void testExample2() {
            int[] result = solver.twoSumHashMap(new int[]{3, 2, 4}, 6);
            assertArrayEquals(new int[]{1, 2}, result);
        }

        @Test
        public void testExample3() {
            int[] result = solver.twoSumHashMap(new int[]{3, 3}, 6);
            assertArrayEquals(new int[]{0, 1}, result);
        }

        @Test
        public void testNoSolution() {
            int[] result = solver.twoSumHashMap(new int[]{1, 2, 3}, 100);
            assertEquals(0, result.length);
        }

        @Test
        public void testNegativeNumbers() {
            int[] result = solver.twoSumHashMap(new int[]{-3, 4, 3, 90}, 0);
            assertArrayEquals(new int[]{0, 2}, result);
        }
    }
}
