package com.corindiano.hackerrank_cracking_the_code_interview;

/**
 * See https://www.hackerrank.com/challenges/ctci-linked-list-cycle.
 *
 * Input:
 * LinkedList denoted by Node head.
 *
 * Output:
 * True - has a cycle, False otherwise
 */
public class Ex06_DetectCycle {
    public static boolean solve(Node head) {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (slow != null && fast != null) {
            if (fast == slow) {
                return true;
            }

            slow = slow.next;
            fast = fast.next == null ? null : fast.next.next;
        }

        return false;
    }

    protected static class Node {
        int data;
        Node next;
    }
}