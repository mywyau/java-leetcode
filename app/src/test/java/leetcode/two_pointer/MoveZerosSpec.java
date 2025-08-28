package leetcode.two_pointer;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import leetcode.easy.arrays.two_pointers.MoveZeros;

public class MoveZerosSpec {

    MoveZeros MoveZeros = new MoveZeros();

    @Test
    void testMoveZeros() {
        assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, MoveZeros.moveZeros(new int[] { 0, 1, 0, 3, 12 }));
    }

    @Test
    void testMoveZeros2() {
        assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, MoveZeros.moveZeros2(new int[] { 0, 1, 0, 3, 12 }));
    }

}
