package com.corindiano.hackerrank_cracking_the_code_interview;

import java.util.HashMap;
import java.util.Map;

/**
 * See https://www.hackerrank.com/challenges/ctci-ransom-note.
 *
 * Input:
 * 6 4
 * give me one grand today night
 * give one grand today
 *
 * Output:
 * Yes
 *
 * Input:
 * 6 5
 * two times three is not four
 * two times two is four
 *
 * Output:
 * No
 */
public class Ex05_RansomNote {
    public static String solve(int m, int n, String magazine, String note) {
        if (m < 0 || n < 0 || n > m || magazine == null || note == null) {
            throw new IllegalArgumentException("Invalid parameters!");
        }

        Map<String, Integer> magazineMap = toMap(magazine);
        return contains(magazineMap, note) ? "Yes" : "No";
    }

    private static Map<String, Integer> toMap(String string) {
        Map<String, Integer> map = new HashMap<>();

        for (String token : string.split("\\s")) {
            if (map.containsKey(token)) {
                map.put(token, map.get(token) + 1);
            } else {
                map.put(token, 1);
            }
        }

        return map;
    }

    private static boolean contains(Map<String, Integer> map, String string) {
        for (String token : string.split("\\s")) {
            if (!map.containsKey(token)) {
                return false;
            } else {
                int value = map.get(token);

                if (value == 1) {
                    map.remove(token);
                } else {
                    map.put(token, value - 1);
                }
            }
        }

        return true;
    }
}