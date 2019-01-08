package com.rever.leetcode.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Matrix2DTest {

    private final Matrix2D matrix2D = new Matrix2D();

    @Test
    public void search_should_return_false_when_given_matrix_is_empty() {
        assertThat(matrix2D.search(0, new int[][]{}), is(false));
    }


    @Test
    public void search_should_return_false_when_given_matrix_size_is_0() {
        int[][] matrix = new int[1][];
        matrix[0] = new int[]{};
        assertThat(matrix2D.search(0, matrix), is(false));
    }


    @Test
    public void search_should_return_true_when_given_matrix_right_and_the_target_is_exist_in_the_matrix() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[]{1, 3, 5, 7};
        matrix[1] = new int[]{10, 11, 16, 20};
        matrix[2] = new int[]{23, 30, 34, 50};
        assertThat(matrix2D.search(11, matrix), is(true));
    }

    @Test
    public void search_should_return_false_when_given_matrix_right_and_the_target_is_not_exist_in_the_matrix() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[]{1, 3, 5, 7};
        matrix[1] = new int[]{10, 11, 16, 20};
        matrix[2] = new int[]{23, 30, 34, 50};
        assertThat(matrix2D.search(12, matrix), is(false));
    }


}