package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Ex14_CoinChange {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex14_CoinChange.solve(-9, null);
    }

    @Test
    public void testSimpleCase() {
        assertEquals(1, Ex14_CoinChange.solve(4, new int[] {4}));
    }

    @Test
    public void testTwoCases() {
        assertEquals(2, Ex14_CoinChange.solve(4, new int[] {1, 4}));
    }

    @Test
    public void testThreeCases() {
        assertEquals(3, Ex14_CoinChange.solve(3, new int[] {3, 1, 2}));
    }

    @Test
    public void testSampleCase() {
        assertEquals(4, Ex14_CoinChange.solve(4, new int[] {1, 2, 3}));
    }

    @Test
    public void testSampleCase2() {
        assertEquals(884, Ex14_CoinChange.solve(100, new int[] {1, 2, 3}));
    }

    @Test
    public void testSampleCase3() {
        assertEquals(3, Ex14_CoinChange.solve(6, new int[] {2, 5, 3, 6}));
    }

    @Test
    public void testSampleCase4() {
        assertEquals(5621927, Ex14_CoinChange.solve(222, new int[] {
            3, 25, 34,
            38, 26, 42,
            16, 10, 15,
            50, 39, 44,
            36, 29, 22,
            43, 20, 27,
            9, 30, 47,
            13, 40, 33 }
            ));
    }

    @Test
    public void testSampleCase5() {
        assertEquals(127101770,
            Ex14_CoinChange.solve(240, new int[] {
                23, 20, 35, 42,19,3,34,9,28,38,13,41,26,14,27,39,24,37,46,29,43,1,21
            })
        );
    }
}