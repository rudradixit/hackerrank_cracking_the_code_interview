package com.corindiano.hackerrank_cracking_the_code_interview;

import java.util.*;

/**
 * See https://www.hackerrank.com/challenges/ctci-contacts for more details.
 *
 * Input:
 * 4
 * add hack
 * add hackerrank
 * find hac
 * find hak
 *
 * Output:
 * 2
 * 0
 */
public class Ex04_Contacts {
    private static final String ADD = "add";
    private static final String FIND = "find";

    public static List<Integer> solve(int ops, String[] operations) {
        if (ops < 0 || operations == null || operations.length != ops) {
            throw new IllegalArgumentException("Invalid parameters!");
        }

        Node root = new Node();
        List<Integer> results = new ArrayList<>();
        String[] tokens;
        String op;
        String contact;
        
        for (String operation : operations) {
            tokens = operation.split(" ");
            op = tokens[0];
            contact = tokens[1];

            if (ADD.equals(op)) {
                add(root, contact);
            } else if (FIND.equals(op)) {
                results.add(count(root, contact));
            }
        }

        return results;
    }

    private static void add(Node node, String name) {
        Node child = node;
        Node newNode;

        for (char c : name.toCharArray()) {
            if (child.children.containsKey(c)) {
                child = child.children.get(c);
                child.numberOfWords++;
                continue;
            }

            newNode = new Node();
            newNode.data = c;
            newNode.numberOfWords = 1;
            child.children.put(c, newNode);
            child = newNode;
        }
    }
    
    private static int count(Node node, String prefix) {
        for (char c : prefix.toCharArray()) {
            if (!node.children.containsKey(c)) {
                return 0;
            }
            
            node = node.children.get(c);
        }
        
        return node.numberOfWords;
    }
    
    private static class Node {
        char data;
        Map<Character, Node> children = new HashMap<>();
        int numberOfWords;
    }
}