package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Test_Ex06_DetectCycle {
    @Test
    public void testCaseWithCycle() {
        Ex06_DetectCycle.Node head = new Ex06_DetectCycle.Node();
        Ex06_DetectCycle.Node first = new Ex06_DetectCycle.Node();
        Ex06_DetectCycle.Node second = new Ex06_DetectCycle.Node();
        Ex06_DetectCycle.Node third = new Ex06_DetectCycle.Node();

        first.data = 1;
        second.data = 2;
        third.data = 3;

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = first;

        assertTrue(Ex06_DetectCycle.solve(head));
    }

    @Test
    public void testCaseWithoutCycle() {
        Ex06_DetectCycle.Node head = new Ex06_DetectCycle.Node();
        Ex06_DetectCycle.Node first = new Ex06_DetectCycle.Node();
        Ex06_DetectCycle.Node second = new Ex06_DetectCycle.Node();
        Ex06_DetectCycle.Node third = new Ex06_DetectCycle.Node();

        first.data = 1;
        second.data = 2;
        third.data = 3;

        head.next = first;
        first.next = second;
        second.next = third;

        assertFalse(Ex06_DetectCycle.solve(head));
    }
}