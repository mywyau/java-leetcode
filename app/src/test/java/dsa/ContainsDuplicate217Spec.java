package dsa;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import dsa.arrays.ContainsDuplicate217;

public class ContainsDuplicate217Spec {

    @Test
    void testWithNoDuplicatesBrute() {
        ContainsDuplicate217 solver = new ContainsDuplicate217();
        assertFalse(solver.containsDuplicateBruteForce(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    void testWithDuplicatesBrute() {
        ContainsDuplicate217 solver = new ContainsDuplicate217();
        assertTrue(solver.containsDuplicateBruteForce(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    void testWithNoDuplicates() {
        ContainsDuplicate217 solver = new ContainsDuplicate217();
        assertFalse(solver.containsDuplicate(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    void testWithDuplicates() {
        ContainsDuplicate217 solver = new ContainsDuplicate217();
        assertTrue(solver.containsDuplicate(new int[] { 1, 2, 3, 1 }));
    }
}
