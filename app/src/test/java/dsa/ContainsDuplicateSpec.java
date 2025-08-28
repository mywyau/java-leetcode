package dsa;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import dsa.hash_set.ContainsDuplicate;

public class ContainsDuplicateSpec {

    @Test
    void testWithNoDuplicatesBrute() {
        ContainsDuplicate solver = new ContainsDuplicate();
        assertFalse(solver.containsDuplicateBruteForce(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    void testWithDuplicatesBrute() {
        ContainsDuplicate solver = new ContainsDuplicate();
        assertTrue(solver.containsDuplicateBruteForce(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    void testWithNoDuplicates() {
        ContainsDuplicate solver = new ContainsDuplicate();
        assertFalse(solver.containsDuplicate(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    void testWithDuplicates() {
        ContainsDuplicate solver = new ContainsDuplicate();
        assertTrue(solver.containsDuplicate(new int[] { 1, 2, 3, 1 }));
    }
}
