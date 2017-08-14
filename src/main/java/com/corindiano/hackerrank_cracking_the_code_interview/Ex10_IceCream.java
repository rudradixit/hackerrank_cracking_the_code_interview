package com.corindiano.hackerrank_cracking_the_code_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex10_IceCream {
    public static List<String> solve(int t, int m, int[] flavors) {
        List<String> results = new ArrayList<>();

        for(int test = 0; test < t; test++) {
            IceCream[] arr = new IceCream[flavors.length];

            for (int i = 0; i < flavors.length; i++)
                arr[i] = new IceCream(flavors[i], i + 1);

            Arrays.sort(arr);
            for(int i = 0; i < flavors.length - 1 ; i++) {
                int search = m - arr[i].flavor;
                if(search >= arr[i].flavor) {
                    int index = binarySearch( i + 1, flavors.length - 1, arr, search);
                    if( index != -1 ) {
                        results.add( Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
                        break;

                    }
                }
            }

        }

        return results;
    }

    private static int binarySearch(int first, int last, IceCream[] arr, int search) {
        if (last < first) {
            return -1;
        }

        int mid = (last + first) / 2;

        if (arr[mid].flavor == search) {
            return arr[mid].index;
        } else if (search < arr[mid].flavor) {
            return binarySearch(first, mid - 1, arr, search);
        } else {
            return binarySearch(mid + 1, last, arr, search);
        }
    }

    private static class IceCream implements Comparable<IceCream> {
        int flavor;
        int index;

        public IceCream(int flavor, int index) {
            this.flavor = flavor;
            this.index = index;
        }

        @Override
        public int compareTo(IceCream other) {
            if (other == null) throw new IllegalArgumentException("Invalid object!");

            return this.flavor - other.flavor;
        }

        @Override
        public boolean equals(Object o){
            if (o == null) return false;
            if (!(o instanceof IceCream)) return false;
            IceCream other = (IceCream)o;
            if (other == this) return true;

            return other.flavor == this.flavor && other.index == this.index;
        }

    }
}