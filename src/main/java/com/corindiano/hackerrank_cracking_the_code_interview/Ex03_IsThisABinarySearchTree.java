package com.corindiano.hackerrank_cracking_the_code_interview;

/**
 * See https://www.hackerrank.com/challenges/ctci-is-binary-search-tree for more details.
 *
 * Hidden stub code will pass a root argument to the function below.
 * Complete the function to solve the challenge.
 * Hint: you may want to write one or more helper functions.
 * The Node class is defined as follows:
 *
 *  class Node {
 *    int data;
 *    Node left;
 *    Node right;
 *  }
 *
 *
 */
public class Ex03_IsThisABinarySearchTree {
    public static boolean solve(Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Invalid root!");
        }

        return _solve(root, null, null);
    }
    
    private static boolean _solve(Node node, Integer min, Integer max) {
        if (min != null && node.data <= min) {
            return false;
        }
        
        if (max != null && node.data >= max) {
            return false;
        }
        
        if (node.left != null) {
            if (node.left.data >= node.data) {
                return false;
            }
        }
        
        if (node.right != null) {
            if (node.right.data <= node.data) {
                return false;
            }
        }
        
        return  (node.left == null || _solve(node.left,  min, node.data)) && 
               (node.right == null || _solve(node.right, node.data, max));
    }

    protected static class Node {
        int data;
        Node left;
        Node right;

        @Override
        public String toString() {
            return "" + data;
        }
    }
}