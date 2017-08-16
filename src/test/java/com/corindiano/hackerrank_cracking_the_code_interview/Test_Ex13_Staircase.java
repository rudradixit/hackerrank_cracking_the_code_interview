package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Test_Ex13_Staircase {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex13_Staircase.solve(null);
    }

    @Test
    public void testSampleCase() {
        int[] results = Ex13_Staircase.solve(new int[] {1, 3, 7});
        assertArrayEquals(new int[]{1, 4, 44}, results);
    }

    @Test
    public void testSampleCases() {
        assertArrayEquals(new int[]{1, 4, 44}, Ex13_Staircase.solve(new int[] {1, 3, 7}));
        assertArrayEquals(new int[]{1, 2, 4, 7, 13}, Ex13_Staircase.solve(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void testLongRunning() {
        assertArrayEquals(new int[]{181997601, 334745777, 1132436852, 2082876103, 2082876103}, Ex13_Staircase.solve(new int[] {32, 33, 35, 36, 36}));
    }
}