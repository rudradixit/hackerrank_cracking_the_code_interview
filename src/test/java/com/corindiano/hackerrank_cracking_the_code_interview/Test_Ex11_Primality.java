package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Test_Ex11_Primality {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex11_Primality.solve(null);
    }

    @Test
    public void testSampleCase() {
        List<String> expected = new ArrayList<>();
        expected.add("Not prime");
        expected.add("Prime");
        expected.add("Prime");
        List<String> results = Ex11_Primality.solve(new int[]{12, 5, 7});
        assertNotNull(results);
        assertEquals(expected, results);
    }

    @Test
    public void testSampleCase2() {
        List<String> expected = new ArrayList<>();
        expected.add("Prime");
        expected.add("Prime");
        expected.add("Prime");
        expected.add("Prime");
        expected.add("Prime");
        expected.add("Prime");
        expected.add("Prime");
        expected.add("Prime");
        expected.add("Prime");
        expected.add("Prime");
        expected.add("Prime");
        List<String> results = Ex11_Primality.solve(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31});
        assertNotNull(results);
        assertEquals(expected, results);
    }

    @Test
    public void testSampleCase3() {
        List<String> expected = new ArrayList<>();
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Not prime");
        expected.add("Prime");
        List<String> results = Ex11_Primality.solve(new int[]{
            1,
            4,
            9,
            16,
            25,
            36,
            49,
            64,
            81,
            100,
            121,
            144,
            169,
            196,
            225,
            256,
            289,
            324,
            361,
            400,
            441,
            484,
            529,
            576,
            625,
            676,
            729,
            784,
            841,
            907
        });
        assertNotNull(results);
        assertEquals(expected, results);
    }
}