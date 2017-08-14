package com.corindiano.hackerrank_cracking_the_code_interview;

import java.util.ArrayList;
import java.util.List;

public class Ex11_Primality {
    public static List<String> solve(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Invalid numbers array!");
        }

        List<String> list = new ArrayList<>();
        int limit;
        
        for (int n : numbers) {
            if (n <= 0) {
                throw new IllegalArgumentException("Invalid number!");
            }
            
            if (n == 1) {
                list.add("Not prime");
            } else {            
                limit = (int)Math.sqrt(n);
                boolean found = false;
                
                for (int j=2; j<=limit; j++) {
                    if (n % j == 0) {
                        found = true;
                        break;
                    }
                }
                
                list.add(found ? "Not prime" : "Prime");
            }
        }
        
        return list;
    }
}