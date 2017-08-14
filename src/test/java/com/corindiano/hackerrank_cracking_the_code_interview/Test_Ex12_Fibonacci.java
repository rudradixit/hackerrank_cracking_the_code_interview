package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Ex12_Fibonacci {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex12_Fibonacci.solve(-1);
    }

    @Test
    public void testWith1() {
        assertEquals(1, Ex12_Fibonacci.solve(1));
    }

    @Test
    public void testWith0() {
        assertEquals(0, Ex12_Fibonacci.solve(0));
    }

    @Test
    public void testWithMany() {
        assertEquals(1, Ex12_Fibonacci.solve(2));
        assertEquals(2, Ex12_Fibonacci.solve(3));
        assertEquals(5, Ex12_Fibonacci.solve(5));
        assertEquals(8, Ex12_Fibonacci.solve(6));
        assertEquals(102334155, Ex12_Fibonacci.solve(40));
    }
}