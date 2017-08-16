package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Test_Ex15_PhonePad {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNegative() {
        Ex15_PhonePad.solve(-1, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNumbersContaining0sOr1s() {
        Ex15_PhonePad.solve(872101, null);
    }

    @Test
    public void testHappyPath() {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("god");
        dictionary.add("ace");
        dictionary.add("apple");
        dictionary.add("abe");
        dictionary.add("dog");
        dictionary.add("fog");
        dictionary.add("fff");
        List<String> results = Ex15_PhonePad.solve(364, dictionary);
        assertNotNull(results);
        assertEquals(new ArrayList<String>() {{ add("dog"); add("fog"); }}, results);
    }
}