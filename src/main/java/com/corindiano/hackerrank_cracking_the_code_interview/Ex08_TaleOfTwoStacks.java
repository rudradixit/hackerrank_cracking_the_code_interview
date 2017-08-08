package com.corindiano.hackerrank_cracking_the_code_interview;

import java.util.ArrayList;
import java.util.List;

/**
 * See https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks.
 *
 * Input:
 * 10
 * 1 42
 * 2
 * 1 14
 * 3
 * 1 28
 * 3
 * 1 60
 * 1 78
 * 2
 * 2
 *
 * Output:
 * 14
 * 14
 */
public class Ex08_TaleOfTwoStacks {
    public static List<Integer> solve(String[] queries) {
        if (queries == null || queries.length == 0) {
            throw new IllegalArgumentException("Invalid queries!");
        }

        List<Integer> results = new ArrayList<>();
        MyQueue<Integer> queue = new MyQueue<>();
        int n = Integer.parseInt(queries[0]);
        String[] tokens;
        int operation;

        for (int i = 1; i <= n; i++) {
            tokens = queries[i].split("\\s");
            operation = Integer.parseInt(tokens[0]);

            if (operation == 1) {
                queue.enqueue(Integer.parseInt(tokens[1]));
            } else if (operation == 2) {
                queue.dequeue();
            } else if (operation == 3) {
                results.add(queue.peek());
            }
        }

        return results;
    }

    protected static class MyQueue<T> {
        Stack<T> primary = new Stack<>();
        Stack<T> secondary = new Stack<>();
        
        public void enqueue(T value) {
            primary.push(value);
        }
        
        public T peek() {
            if (secondary.size() == 0) {            
                while (primary.size() > 0) {
                    secondary.push(primary.pop());
                }
            }
            
            return secondary.peek();
        }
        
        public T dequeue() {
            if (secondary.size() == 0) {            
                while (primary.size() > 0) {
                    secondary.push(primary.pop());
                }
            }
            
            return secondary.pop();
        }
    }
    
    protected static class Stack<T> {
        private Node<T> head = new Node<>();
        private int counter = 0;
        
        public void push(T data) {
            Node<T> walker = head;
            
            while (walker.next != null) {
                walker = walker.next;
            }
            
            Node<T> newNode = new Node<>();
            newNode.data = data;
            walker.next = newNode;
            counter++;
        }
        
        public T pop() {
            Node<T> walker = head, slow = head;
            
            while (walker.next != null) {
                slow = walker;
                walker = walker.next;
            }
            
            T data = walker.data;
            slow.next = null;
            counter--;
            return data;
        }
        
        public T peek() {
            Node<T> walker = head;
            
            while (walker.next != null) {
                walker = walker.next;
            }
            
            return walker.data;
        }
        
        public int size() {
            return counter;
        }
    }

    protected static class Node<T> {
        T data;
        Node<T> next;
    }
}