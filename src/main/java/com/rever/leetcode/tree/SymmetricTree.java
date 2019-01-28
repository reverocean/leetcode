package com.rever.leetcode.tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public boolean isSymmetric(Node tree) {
        if (tree == null) {
            return true;
        }

        return isSymmetricHelper(tree.getLeft(), tree.getRight());
    }

    public boolean isSymmetricLoop(Node tree) {
        if (tree == null) {
            return true;
        }

        Node left = tree.getLeft();
        Node right = tree.getRight();

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        LinkedList<Node> queue1 = new LinkedList<>();
        LinkedList<Node> queue2 = new LinkedList<>();

        queue1.add(left);
        queue2.add(right);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            Node leftSubTree = queue1.pop();
            Node rightSubTree = queue2.pop();

            if ((leftSubTree == null && rightSubTree != null) || (rightSubTree == null && leftSubTree != null)) {
                return false;
            }

            if (rightSubTree != null && leftSubTree != null) {
                if (leftSubTree.getValue() != rightSubTree.getValue()) {
                    return false;
                }

                queue1.add(leftSubTree.getLeft());
                queue1.add(leftSubTree.getRight());

                queue2.add(rightSubTree.getRight());
                queue2.add(rightSubTree.getLeft());
            }
        }

        return true;
    }

    private boolean isSymmetricHelper(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.getValue() != right.getValue()) {
            return false;
        }

        return isSymmetricHelper(left.getLeft(), right.getRight()) && isSymmetricHelper(left.getRight(), right.getLeft());
    }
}
