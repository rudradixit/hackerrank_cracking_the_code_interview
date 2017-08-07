package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Ex02_MakingAnagrams {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex02_MakingAnagrams.solve(null, null);
    }

    @Test
    public void testSampleCase() {
        int result = Ex02_MakingAnagrams.solve("cde", "abc");
        assertEquals(4, result);
    }

    @Test
    public void testWithNoMatches() {
        int result = Ex02_MakingAnagrams.solve("cde", "abz");
        assertEquals(6, result);
    }

    @Test
    public void testWithAllMatches() {
        int result = Ex02_MakingAnagrams.solve("abc", "abc");
        assertEquals(0, result);
    }

    @Test
    public void testWithRandom() {
        int result = Ex02_MakingAnagrams.solve("imkhnpqnhlvaxlmrsskbyyrhwfvgteubrelgubvdmrdmesfxkpykprunzpustowmvhupkqsyjxmnptkcilmzcinbzjwvxshubeln", "wfnfdassvfugqjfuruwrdumdmvxpbjcxorettxmpcivurcolxmeagsdundjronoehtyaskpwumqmpgzmtdmbvsykxhblxspgnpgfzydukvizbhlwmaajuytrhxeepvmcltjmroibjsdkbqjnqjwmhsfopjvehhiuctgthrxqjaclqnyjwxxfpdueorkvaspdnywupvmy");
        assertEquals(102, result);
    }
}