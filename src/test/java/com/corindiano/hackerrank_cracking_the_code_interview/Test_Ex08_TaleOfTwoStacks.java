package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class Test_Ex08_TaleOfTwoStacks {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex08_TaleOfTwoStacks.solve(null);
    }

    @Test
    public void testWithSampleCase() {
        String[] queries = new String[]{
            "10",
            "1 42",
            "2",
            "1 14",
            "3",
            "1 28",
            "3",
            "1 60",
            "1 78",
            "2",
            "2"
        };
        List<Integer> results = Ex08_TaleOfTwoStacks.solve(queries);
        assertNotNull(results);
        assertEquals(2, results.size());
        assertEquals(Integer.valueOf(14), results.get(0));
        assertEquals(Integer.valueOf(14), results.get(1));
    }

    @Test
    public void testWithMassiveData() {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/ex08_data.txt")));
            String line;
            List<String> queries = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                queries.add(line);
            }

            reader.close();

            reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/ex08_results.txt")));
            List<Integer> fixedResults = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                fixedResults.add(Integer.parseInt(line));
            }

            reader.close();

            List<Integer> results = Ex08_TaleOfTwoStacks.solve(queries.toArray(new String[0]));
            assertNotNull(results);
            assertEquals(1650, results.size());
            assertEquals(fixedResults, results);
        } catch (Exception exc) {
            fail("Exception thrown: " + exc.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}