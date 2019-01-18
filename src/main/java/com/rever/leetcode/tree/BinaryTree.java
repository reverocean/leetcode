package com.rever.leetcode.tree;

public class BinaryTree {
    public int getMaxDepth(Node tree) {
        if (tree == null) {
            return 0;
        }

        Node left = tree.getLeft();
        Node right = tree.getRight();

        int leftDepth = getMaxDepth(left);

        int rightDepth = getMaxDepth(right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
