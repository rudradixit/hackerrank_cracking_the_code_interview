package com.corindiano.hackerrank_cracking_the_code_interview;

import java.util.HashMap;
import java.util.Map;

public class Ex14_CoinChange {
    private static Map<Tuple, Long> CACHE = new HashMap<>();

    public static long solve(int dollars, int[] coins) {
        if (dollars < 0 || coins == null) {
            throw new IllegalArgumentException("Invalid dollars / coins!");
        }

        if (dollars == 0) {
            return 0;
        }
        
        return count(dollars, coins, 0);
    }
    
    private static long count(int dollars, int[] coins, int index) {
        Tuple tuple = new Tuple(dollars, coins[index]);

        if (CACHE.containsKey(tuple)) {
            return CACHE.get(tuple);
        }

        long count = 0;
        int diff, coin;

        for (int i=index; i<coins.length; i++) {
            coin = coins[i];
            diff = dollars - coin;

            if (diff == 0) {
                count++;
            } else if (diff > 0) {
                count += count(diff, coins, i);
            }
        }

        CACHE.put(tuple, count);

        return count;
    }

    private static class Tuple {
        int dollars, coin;

        Tuple(int dollars, int coin) {
            this.dollars = dollars;
            this.coin = coin;
        }

        @Override
        public int hashCode() {
            int result = 31 * (this.dollars + 19);
            result += 31 * (this.coin + 19);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (!(obj instanceof Tuple)) return false;
            if (this == obj) return true;
            Tuple other = (Tuple) obj;
            return (this.dollars == other.dollars) && (this.coin == other.coin);
        }
    }
}