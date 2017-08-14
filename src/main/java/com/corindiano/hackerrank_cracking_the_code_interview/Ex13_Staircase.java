package com.corindiano.hackerrank_cracking_the_code_interview;

import java.util.HashMap;
import java.util.Map;

public class Ex13_Staircase {
    private static Map<Integer, Integer> CACHE = new HashMap<>();

    public static int[] solve(int[] staircases) {
        if (staircases == null || staircases.length == 0) {
            throw new IllegalArgumentException("Invalid staircases!");
        }

        int[] ways = new int[staircases.length];
        int i=0;

        for (int steps : staircases) {
            ways[i++] = count(steps);
            System.out.printf("CACHE: %s%n", CACHE);
        }
        
        return ways;
    }
    
    private static int count(int steps) {
        if (CACHE.containsKey(steps)) {
            return CACHE.get(steps);
        }

        int count = 0;
        
        if (steps == 0) {
            return 1;
        }
        
        if (steps >= 1) {
            count += count(steps - 1);
        }
        
        if (steps >= 2) {
            count += count(steps - 2);
        }
        
        if (steps >= 3) {
            count += count(steps - 3);
        }
        
        CACHE.put(steps, count);
        System.out.printf("CACHE: %s%n", CACHE);

        return count;
    }
}