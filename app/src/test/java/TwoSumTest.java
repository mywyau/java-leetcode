
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import easy.TwoSum;

public class TwoSumTest {

    @Test
    public void testExample1() {
        TwoSum solver = new TwoSum();
        int[] result = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testExample2() {
        TwoSum solver = new TwoSum();
        int[] result = solver.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testExample3() {
        TwoSum solver = new TwoSum();
        int[] result = solver.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testNoSolution() {
        TwoSum solver = new TwoSum();
        int[] result = solver.twoSum(new int[]{1, 2, 3}, 100);
        assertEquals(0, result.length); // returns empty array
    }

    @Test
    public void testNegativeNumbers() {
        TwoSum solver = new TwoSum();
        int[] result = solver.twoSum(new int[]{-3, 4, 3, 90}, 0);
        assertArrayEquals(new int[]{0, 2}, result);
    }
}
