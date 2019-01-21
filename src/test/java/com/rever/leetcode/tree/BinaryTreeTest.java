package com.rever.leetcode.tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BinaryTreeTest {

    private final BinaryTree binaryTree = new BinaryTree();

    @Test
    public void getMaxDepth_should_return_0_when_the_tree_is_null() {
        Node node = null;

        int maxDepth = binaryTree.getMaxDepth(node);

        assertThat(maxDepth, is(0));
    }

    @Test
    public void getMaxDepth_should_return_1_when_the_tree_is_only_one_node() {
        Node node = new Node();

        int maxDepth = binaryTree.getMaxDepth(node);

        assertThat(maxDepth, is(1));
    }

    @Test
    public void getMaxDepth_should_return_2_when_the_tree_is_only_one_node_with_one_left_child() {
        Node node = new Node();
        Node leftNode = new Node();

        node.setLeft(leftNode);
        int maxDepth = binaryTree.getMaxDepth(node);

        assertThat(maxDepth, is(2));
    }

    @Test
    public void getMaxDepth_should_return_2_when_the_tree_is_only_one_node_with_one_right_child() {
        Node node = new Node();
        Node rightNode = new Node();

        node.setRight(rightNode);
        int maxDepth = binaryTree.getMaxDepth(node);

        assertThat(maxDepth, is(2));
    }

    @Test
    public void getMaxDepth_should_return_3_when_the_tree_is_only_one_node_with_tow_right_child() {
        Node node = new Node();
        Node rightNode = new Node();
        Node rightNode2 = new Node();
        rightNode.setLeft(rightNode2);

        node.setRight(rightNode);
        int maxDepth = binaryTree.getMaxDepth(node);

        assertThat(maxDepth, is(3));
    }


    @Test
    public void getMinDepth_should_return_0_when_the_tree_is_null() {
        Node node = null;

        int minDepth = binaryTree.getMinDepth(node);

        assertThat(minDepth, is(0));
    }

    @Test
    public void getMinDepth_should_return_1_when_the_tree_is_only_one_node() {
        Node node = new Node();

        int minDepth = binaryTree.getMinDepth(node);

        assertThat(minDepth, is(1));
    }

    @Test
    public void getMinDepth_should_return_1_when_the_tree_is_only_one_node_with_one_left_child() {
        Node node = new Node();
        Node leftNode = new Node();

        node.setLeft(leftNode);
        int minDepth = binaryTree.getMinDepth(node);

        assertThat(minDepth, is(1));
    }

    @Test
    public void getMinDepth_should_return_1_when_the_tree_is_only_one_node_with_one_left_child_and_two_right_child() {
        Node node = new Node();
        Node leftNode = new Node();

        node.setLeft(leftNode);

        Node rightNode = new Node();
        Node rightNode2 = new Node();
        Node rightNode3 = new Node();
        rightNode.setLeft(rightNode2);
        rightNode.setRight(rightNode3);

        node.setRight(rightNode);


        int minDepth = binaryTree.getMinDepth(node);

        assertThat(minDepth, is(2));
    }

}