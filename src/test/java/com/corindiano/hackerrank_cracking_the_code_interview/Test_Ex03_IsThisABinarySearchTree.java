package com.corindiano.hackerrank_cracking_the_code_interview;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Test_Ex03_IsThisABinarySearchTree {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() {
        Ex03_IsThisABinarySearchTree.solve(null);
    }

    @Test
    public void testSampleCase() {
        Ex03_IsThisABinarySearchTree.Node leftLeftGrandChild = new Ex03_IsThisABinarySearchTree.Node();
        leftLeftGrandChild.data = 1;
        Ex03_IsThisABinarySearchTree.Node rightLeftGrandChild = new Ex03_IsThisABinarySearchTree.Node();
        rightLeftGrandChild.data = 3;
        Ex03_IsThisABinarySearchTree.Node leftChild = new Ex03_IsThisABinarySearchTree.Node();
        leftChild.data = 2;
        leftChild.left = leftLeftGrandChild;
        leftChild.right = rightLeftGrandChild;
        Ex03_IsThisABinarySearchTree.Node leftRightGrandChild = new Ex03_IsThisABinarySearchTree.Node();
        leftRightGrandChild.data = 5;
        Ex03_IsThisABinarySearchTree.Node rightRightGrandChild = new Ex03_IsThisABinarySearchTree.Node();
        rightRightGrandChild.data = 7;
        Ex03_IsThisABinarySearchTree.Node rightChild = new Ex03_IsThisABinarySearchTree.Node();
        rightChild.data = 6;
        rightChild.left = leftRightGrandChild;
        rightChild.right = rightRightGrandChild;
        Ex03_IsThisABinarySearchTree.Node root = new Ex03_IsThisABinarySearchTree.Node();
        root.data = 4;
        root.left = leftChild;
        root.right = rightChild;
        assertTrue(Ex03_IsThisABinarySearchTree.solve(root));
    }

    @Test
    public void testBrokenTree() {
        Ex03_IsThisABinarySearchTree.Node leftLeftGrandChild = new Ex03_IsThisABinarySearchTree.Node();
        leftLeftGrandChild.data = 1;
        Ex03_IsThisABinarySearchTree.Node rightLeftGrandChild = new Ex03_IsThisABinarySearchTree.Node();
        rightLeftGrandChild.data = 3;
        Ex03_IsThisABinarySearchTree.Node leftChild = new Ex03_IsThisABinarySearchTree.Node();
        leftChild.data = 2;
        leftChild.left = leftLeftGrandChild;
        leftChild.right = rightLeftGrandChild;
        Ex03_IsThisABinarySearchTree.Node leftRightGrandChild = new Ex03_IsThisABinarySearchTree.Node();
        leftRightGrandChild.data = 4;
        Ex03_IsThisABinarySearchTree.Node rightRightGrandChild = new Ex03_IsThisABinarySearchTree.Node();
        rightRightGrandChild.data = 7;
        Ex03_IsThisABinarySearchTree.Node rightChild = new Ex03_IsThisABinarySearchTree.Node();
        rightChild.data = 6;
        rightChild.left = leftRightGrandChild;
        rightChild.right = rightRightGrandChild;
        Ex03_IsThisABinarySearchTree.Node root = new Ex03_IsThisABinarySearchTree.Node();
        root.data = 5;
        root.left = leftChild;
        root.right = rightChild;
        assertFalse(Ex03_IsThisABinarySearchTree.solve(root));
    }
}