package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test_Ex10_IceCream {
    @Test
    public void testSampleCase() {
        List<String> results = Ex10_IceCream.solve(1, 4, new int[]{1,4,5,3,2});
        assertEquals(1, results.size());
        assertEquals("1 4", results.get(0));
        results = Ex10_IceCream.solve(1, 4, new int[]{2,2,4,3});
        assertEquals(1, results.size());
        assertEquals("1 2", results.get(0));
//        assertEquals("1 2", results.get(1));
    }
}