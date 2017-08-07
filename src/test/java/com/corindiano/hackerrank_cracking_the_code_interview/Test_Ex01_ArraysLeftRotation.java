package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Test_Ex01_ArraysLeftRotation {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex01_ArraysLeftRotation.solve(-1, -1, null);
    }

    @Test
    public void testWithOneElementArray() {
        int[] array = new int[]{ 9 };
        int[] results = Ex01_ArraysLeftRotation.solve(1, 1, array);
        assertNotNull(results);
        assertEquals(array.length, results.length);
        assertArrayEquals(array, results);
    }

    @Test
    public void testWithTwoElementsArray() {
        int[] array = new int[]{ 9, 14 };
        int[] expected = new int[]{ 14, 9 };
        int[] results = Ex01_ArraysLeftRotation.solve(2, 1, array);
        assertNotNull(results);
        assertEquals(2, results.length);
        assertArrayEquals(expected, results);

        results = Ex01_ArraysLeftRotation.solve(2, 2, array);
        assertNotNull(results);
        assertEquals(array.length, results.length);
        assertArrayEquals(array, results);
    }

    @Test
    public void testWithFiveElementsArray() {
        int[] array = new int[]{ 1, 2, 3, 4, 5 };
        int[] expected = new int[]{ 5, 1, 2, 3, 4 };
        int[] results = Ex01_ArraysLeftRotation.solve(5, 4, array);
        assertNotNull(results);
        assertEquals(array.length, results.length);
        assertArrayEquals(expected, results);
    }
}