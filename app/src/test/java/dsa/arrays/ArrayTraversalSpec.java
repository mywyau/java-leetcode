package dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import leetcode.easy.arrays.ArrayTraversal;

public class ArrayTraversalSpec {

    ArrayTraversal arrayTraversal = new ArrayTraversal();

    @Test
    void testFindMax() {
        assertEquals(9, arrayTraversal.findMax(new int[] { 3, 7, 2, 9, 1 }));
    }

    @Test
    void testFindMin() {
        assertEquals(1, arrayTraversal.findMin(new int[] { 3, 7, 2, 9, 1 }));
    }

    @Test
    void testSum() {
        assertEquals(22, arrayTraversal.sum(new int[] { 3, 7, 2, 9, 1 }));
    }

    @Test
    void testNumberOfEvens() {
        assertEquals(1, arrayTraversal.numberOfEvens(new int[] { 3, 7, 2, 9, 1 }));
    }

}
