package com.rever.leetcode.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class TraversalBinaryTreeTest {

    private final BinaryTree binaryTree = new BinaryTree();

    @Test
    public void traversal_binary_tree_by_level_should_return_empty_when_the_given_tree_is_null() {
        int[][] traversalResult = binaryTree.traversalByLevel(null);

        assertThat(traversalResult, equalTo(new int[][]{}));
    }

    @Test
    public void traversal_binary_tree_by_level_should_return_one_element_when_the_given_tree_is_one_node() {
        Node tree = new Node();
        tree.setValue(1);
        int[][] traversalResult = binaryTree.traversalByLevel(tree);

        int[][] expectResult = new int[1][];

        expectResult[0] = new int[]{1};

        assertThat(traversalResult, equalTo(expectResult));
    }


    @Test
    public void traversal_binary_tree_by_level_should_return_1234567_element_when_the_given_tree_is_1234567() {

        Node node4 = new Node(null, null, 4);
        Node node5 = new Node(null, null, 5);
        Node node6 = new Node(null, null, 6);
        Node node7 = new Node(null, null, 7);
        Node node2 = new Node(node4, node5, 2);
        Node node3 = new Node(node6, node7, 3);
        Node node1 = new Node(node2, node3, 1);


        int[][] traversalResult = binaryTree.traversalByLevel(node1);

        int[][] expectResult = new int[3][];

        expectResult[0] = new int[]{1};
        expectResult[1] = new int[]{2, 3};
        expectResult[2] = new int[]{4, 5, 6, 7};

        assertThat(traversalResult, equalTo(expectResult));
    }

}