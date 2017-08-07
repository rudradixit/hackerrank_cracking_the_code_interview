package com.corindiano.hackerrank_cracking_the_code_interview;

/**
 * See https://www.hackerrank.com/challenges/ctci-array-left-rotation for more details.
 *
 * Input:
 * 5 4
 * 1 2 3 4 5
 *
 * Output:
 * 5 1 2 3 4
 */
public class Ex01_ArraysLeftRotation {
    public static int[] solve(int n, int d, int[] array) {
        if (n <= 0 || d < 0 || array == null || array.length == 0 || array.length != n) {
            throw new IllegalArgumentException("One or more invalid parameters!");
        }
        
        if (d == 0) {
            return array;
        }

        int shift = d % n;        
        return leftShift(shift, array);
    }
    
    private static int[] leftShift(int shift, int[] array) {
        int[] output = new int[array.length];
        int index;

        for (int i=0; i<array.length; i++) {
          index = i - shift;
          index = (index < 0) ? index + array.length : index;
          output[index] = array[i];
        }
        
        return output;
    }
}