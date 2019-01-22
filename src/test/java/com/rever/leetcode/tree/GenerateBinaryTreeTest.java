package com.rever.leetcode.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class GenerateBinaryTreeTest {

    private final BinaryTree binaryTree = new BinaryTree();

    @Test
    public void generateTree_should_return_null_when_given_empty_array() {
        int[] tree = binaryTree.generateTree(new int[]{}, new int[]{});

        assertThat(tree, equalTo(new int[]{}));
    }

    @Test
    public void generateTree_should_return_1_when_given_arrays_are_1() {
        int[] tree = binaryTree.generateTree(new int[]{1}, new int[]{1});

        assertThat(tree, equalTo(new int[]{1}));
    }

    @Test
    public void generateTree_should_return_1_2_3_when_given_in_order_array_is_2_1_3_and_post_order_array_is_2_3_1() {
        int[] tree = binaryTree.generateTree(new int[]{2, 1, 3}, new int[]{2, 3, 1});

        assertThat(tree, equalTo(new int[]{1, 2, 3}));
    }

    @Test
    public void generateTree_should_return_1_2_3_4_5_6_7_when_given_in_order_array_is_4251637_and_post_order_array_is_4526731() {
        int[] tree = binaryTree.generateTree(new int[]{4, 2, 5, 1, 6, 3, 7}, new int[]{4, 5, 2, 6, 7, 3, 1});

        assertThat(tree, equalTo(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }


}