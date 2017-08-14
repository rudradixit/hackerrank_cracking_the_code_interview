package com.corindiano.hackerrank_cracking_the_code_interview;

public class Ex12_Fibonacci {
    private static Integer[] CACHE = new Integer[41];

    static {
        CACHE[0] = 0;
        CACHE[1] = 1;
    }

    public static int solve(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid n!");
        }

        if (CACHE[n] != null) {
            return CACHE[n];
        } else {
            CACHE[n] = solve(n-1) + solve(n-2);
            return CACHE[n];
        }
    }
}