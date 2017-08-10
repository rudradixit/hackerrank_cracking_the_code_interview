package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Test_Ex04_Contacts {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex04_Contacts.solve(-1, null);
    }

    @Test
    public void testSampleCase() {
        List<Integer> results = Ex04_Contacts.solve(4, new String[]{
            "add hack",
            "add hackerrank",
            "find hac",
            "find hak",
        });

        assertNotNull(results);
        assertEquals(2, results.size());
        assertEquals(2, results.get(0).intValue());
        assertEquals(0, results.get(1).intValue());
    }

    @Test
    public void testSampleCase2() {
        List<Integer> results = Ex04_Contacts.solve(11, new String[]{
            "add s",
            "add ss",
            "add sss",
            "add ssss",
            "add sssss",
            "find s",
            "find ss",
            "find sss",
            "find ssss",
            "find sssss",
            "find ssssss",
        });

        assertNotNull(results);
        assertEquals(6, results.size());
        assertEquals(5, results.get(0).intValue());
        assertEquals(4, results.get(1).intValue());
        assertEquals(3, results.get(2).intValue());
        assertEquals(2, results.get(3).intValue());
        assertEquals(1, results.get(4).intValue());
        assertEquals(0, results.get(5).intValue());
    }

    @Test
    public void testWithNoCases() {
        List<Integer> results = Ex04_Contacts.solve(3, new String[]{
            "add hack",
            "add hackerrank",
            "find abc"
        });

        assertNotNull(results);
        assertEquals(1, results.size());
        assertEquals(0, results.get(0).intValue());
    }
}