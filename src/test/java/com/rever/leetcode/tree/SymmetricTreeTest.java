package com.rever.leetcode.tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SymmetricTreeTest {

    private final SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    public void isSymmetric_should_return_true_when_the_given_tree_is_null() {
        boolean symmetric = symmetricTree.isSymmetric(null);
        assertThat(symmetric, is(true));
    }

    @Test
    public void isSymmetric_should_return_true_when_the_given_tree_is_one_node() {
        Node tree = new Node();
        boolean symmetric = symmetricTree.isSymmetric(tree);
        assertThat(symmetric, is(true));
    }

    @Test
    public void isSymmetric_should_return_true_when_the_given_tree_is_1_2_2() {
        Node node2Left = new Node(null, null, 2);
        Node node2Right = new Node(null, null, 2);
        Node tree = new Node(node2Left, node2Right, 1);

        boolean symmetric = symmetricTree.isSymmetric(tree);

        assertThat(symmetric, is(true));
    }

    @Test
    public void isSymmetric_should_return_true_when_the_given_tree_is_1_2_2_3_4_4_3() {
        Node node3 = new Node(null, null, 3);
        Node node4 = new Node(null, null, 4);
        Node node2Left = new Node(node3, node4, 2);
        Node node2Right = new Node(node4, node3, 2);
        Node tree = new Node(node2Left, node2Right, 1);

        boolean symmetric = symmetricTree.isSymmetric(tree);

        assertThat(symmetric, is(true));
    }


    @Test
    public void isSymmetric_should_return_false_when_the_given_tree_is_1_2_2_null_3_null_3() {
        Node node3 = new Node(null, null, 3);
        Node node4 = new Node(null, null, 4);
        Node node2Left = new Node(null, node3, 2);
        Node node2Right = new Node(null, node3, 2);
        Node tree = new Node(node2Left, node2Right, 1);

        boolean symmetric = symmetricTree.isSymmetric(tree);

        assertThat(symmetric, is(false));
    }

    @Test
    public void isSymmetricLoop_should_return_true_when_the_given_tree_is_null() {
        boolean symmetric = symmetricTree.isSymmetricLoop(null);
        assertThat(symmetric, is(true));
    }

    @Test
    public void isSymmetricLoop_should_return_true_when_the_given_tree_is_one_node() {
        Node tree = new Node();
        boolean symmetric = symmetricTree.isSymmetricLoop(tree);
        assertThat(symmetric, is(true));
    }

    @Test
    public void isSymmetricLoop_should_return_true_when_the_given_tree_is_1_2_2() {
        Node node2Left = new Node(null, null, 2);
        Node node2Right = new Node(null, null, 2);
        Node tree = new Node(node2Left, node2Right, 1);

        boolean symmetric = symmetricTree.isSymmetricLoop(tree);

        assertThat(symmetric, is(true));
    }

    @Test
    public void isSymmetricLoop_should_return_true_when_the_given_tree_is_1_2_2_3_4_4_3() {
        Node node3 = new Node(null, null, 3);
        Node node4 = new Node(null, null, 4);
        Node node2Left = new Node(node3, node4, 2);
        Node node2Right = new Node(node4, node3, 2);
        Node tree = new Node(node2Left, node2Right, 1);

        boolean symmetric = symmetricTree.isSymmetricLoop(tree);

        assertThat(symmetric, is(true));
    }


    @Test
    public void isSymmetricLoop_should_return_false_when_the_given_tree_is_1_2_2_null_3_null_3() {
        Node node3 = new Node(null, null, 3);
        Node node4 = new Node(null, null, 4);
        Node node2Left = new Node(null, node3, 2);
        Node node2Right = new Node(null, node3, 2);
        Node tree = new Node(node2Left, node2Right, 1);

        boolean symmetric = symmetricTree.isSymmetricLoop(tree);

        assertThat(symmetric, is(false));
    }


}