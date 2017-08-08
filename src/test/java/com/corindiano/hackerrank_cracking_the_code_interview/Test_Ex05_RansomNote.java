package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Ex05_RansomNote {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex05_RansomNote.solve(-1, -1, null, null);
    }

    @Test
    public void testSampleCase1() {
        assertEquals("Yes", Ex05_RansomNote.solve(6, 4, "give me one grand today night", "give one grand today"));
    }

    @Test
    public void testSampleCase2() {
        assertEquals("No", Ex05_RansomNote.solve(6, 5, "two times three is not four", "two times two is four"));
    }
}