package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Test_Ex07_BalancedBrackets {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex07_BalancedBrackets.solve(null);
    }

    @Test
    public void testSampleCase1() {
        assertTrue(Ex07_BalancedBrackets.solve("{[()]}"));
        assertFalse(Ex07_BalancedBrackets.solve("{[(])}"));
        assertTrue(Ex07_BalancedBrackets.solve("{{[[(())]]}}"));
        assertTrue(Ex07_BalancedBrackets.solve("{}()[]"));
    }
}