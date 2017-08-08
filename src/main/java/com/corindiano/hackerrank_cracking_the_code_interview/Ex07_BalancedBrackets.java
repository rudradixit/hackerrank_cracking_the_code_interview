package com.corindiano.hackerrank_cracking_the_code_interview;

public class Ex07_BalancedBrackets {
    
    public static boolean solve(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Invalid expression!");
        }
        
        if (expression.length() % 2 == 1) {
            return false;
        }
        
        char[] array = expression.toCharArray();
        Stack stack = new Stack();
        
        for (char c : array) {
            switch (c) {
                case '(' :
                case '{' :
                case '[' : stack.push(c); break;
                case ')' : if (stack.peek() != '(') { return false; } else { stack.pop(); } break;
                case '}' : if (stack.peek() != '{') { return false; } else { stack.pop(); } break;
                case ']' : if (stack.peek() != '[') { return false; } else { stack.pop(); } break;
            }
        }
        
        return stack.isEmpty();
    }
    
    protected static class Stack {
        private Node head = new Node();
        private int count = 0;
        
        public void push(char data) {
            Node walker = head;
            
            while (walker.next != null) {
                walker = walker.next;
            }
            
            Node newNode = new Node();
            newNode.data = data;
            walker.next = newNode;
            count++;
        }
        
        public char peek() {
            Node walker = head;
            
            while (walker.next != null) {
                walker = walker.next;
            }
            
            return walker.data;
        }
        
        public char pop() {
            Node walker = head, slow = head;
            
            while (walker.next != null) {
                slow = walker;
                walker = walker.next;
            }
            
            char data = walker.data;
            slow.next = null;
            count--;
            return data;
        }
        
        public boolean isEmpty() {
            return count == 0;
        }
    }
    
    protected static class Node {
        char data;
        Node next;
    }
}