package com.corindiano.hackerrank_cracking_the_code_interview;

/**
 * See https://www.hackerrank.com/challenges/ctci-making-anagrams
 *
 * Input:
 * cde
 * abc
 *
 * Output:
 * 4
 */
public class Ex02_MakingAnagrams {
    public static int solve(String str1, String str2) {
        if (str1 == null || str1.trim().isEmpty() || str2 == null || str2.trim().isEmpty()) {
            throw new IllegalArgumentException("One or more invalid parameters!");
        }
        
        int[] map = new int[26];
        
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        
        for (int i=0; i<str1Array.length; i++) {
            map[str1Array[i] - 'a'] = map[str1Array[i] - 'a'] + 1;
        }
        
        for (int i=0; i<str2Array.length; i++) {
            map[str2Array[i] - 'a'] = map[str2Array[i] - 'a'] - 1;
        }
        
        int result = 0;

        for (int i=0; i<map.length; i++) {
            result += Math.abs(map[i]);
        }
        
        return result;
    }
}