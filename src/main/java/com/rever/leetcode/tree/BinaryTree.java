package com.rever.leetcode.tree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.collect.Lists.newArrayList;

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

    public int getMinDepth(Node tree) {
        if (tree == null) {
            return 0;
        }

        Node left = tree.getLeft();
        Node right = tree.getRight();

        int leftDepth = getMinDepth(left);

        int rightDepth = getMinDepth(right);

        return 1 + Math.min(leftDepth, rightDepth);
    }

    private Node generateTreeNew(int[] inOrders, int[] postOrders) {
        if (inOrders.length == 0 && postOrders.length == 0) {
            return null;
        }

        if (inOrders.length == 1 && postOrders.length == 1) {
            Node node = new Node();
            node.setValue(inOrders[0]);
            return node;
        }

        List<Integer> preOrders = newArrayList();

        int rootValue = postOrders[postOrders.length - 1];
        Node tree = new Node();
        tree.setValue(rootValue);

        preOrders.add(rootValue);

        List<Integer> leftInOrders = newArrayList();
        List<Integer> rightInOrders = newArrayList();
        boolean flag = false;
        for (int i = 0; i < inOrders.length; i++) {
            if (inOrders[i] == rootValue) {
                flag = true;
                continue;
            }

            if (flag) {
                rightInOrders.add(inOrders[i]);
            } else {
                leftInOrders.add(inOrders[i]);
            }
        }


        List<Integer> leftPostOrders = newArrayList();
        List<Integer> rightPostOrders = newArrayList();
        for (int i = 0; i < leftInOrders.size(); i++) {
            leftPostOrders.add(postOrders[i]);
        }

        for (int i = rightInOrders.size(); i < postOrders.length - 1; i++) {
            rightPostOrders.add(postOrders[i]);
        }

        tree.setLeft(generateTreeNew(toArray(leftInOrders), toArray(leftPostOrders)));
        tree.setRight(generateTreeNew(toArray(rightInOrders), toArray(rightPostOrders)));

        return tree;
    }

    public int[] generateTree(int[] inOrders, int[] postOrders) {
        if (inOrders.length == 0 && postOrders.length == 0) {
            return new int[]{};
        }

        Node tree = generateTreeNew(inOrders, postOrders);

        List<Integer> list = preOrderTraversal(tree);
        list.add(0, tree.getValue());
        return toArray(list);
    }

    private List<Integer> preOrderTraversal(Node tree) {
        if (tree == null) {
            return Collections.emptyList();
        }
        List<Integer> result = newArrayList();

        if (tree.getLeft() != null) {
            result.add(tree.getLeft().getValue());
        }

        if (tree.getRight() != null) {
            result.add(tree.getRight().getValue());
        }

        result.addAll(preOrderTraversal(tree.getLeft()));
        result.addAll(preOrderTraversal(tree.getRight()));

        return result;
    }

    private List<Integer> toList(int[] array) {
        return Arrays.stream(array).boxed().collect(Collectors.toList());
    }

    private int[] toArray(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
