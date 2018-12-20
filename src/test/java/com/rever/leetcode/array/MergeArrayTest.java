package com.rever.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class MergeArrayTest {

    @Test
    public void merge_should_return_empty_when_given_array_is_empty_and_empty() {
        int[] mergedArray = MergeArray.merge(new int[]{}, 0, new int[]{}, 0);

        assertThat(mergedArray, equalTo(new int[]{}));
    }

    @Test
    public void merge_should_return_1_when_given_array_is_1_and_empty() {
        int[] mergedArray = MergeArray.merge(new int[]{1}, 1, new int[]{}, 0);

        assertThat(mergedArray, equalTo(new int[]{1}));
    }

    @Test
    public void merge_should_return_1_when_given_array_is_empty_and_1() {
        int[] mergedArray = MergeArray.merge(new int[]{0}, 0, new int[]{1}, 1);

        assertThat(mergedArray, equalTo(new int[]{1}));
    }

    @Test
    public void merge_should_return_1_1_when_given_array_is_1_and_1() {
        int[] mergedArray = MergeArray.merge(new int[]{1, 0}, 1, new int[]{1}, 1);

        assertThat(mergedArray, equalTo(new int[]{1, 1}));
    }

    @Test
    public void merge_should_return_1_1_2_when_given_array_is_1_and_1_2() {
        int[] mergedArray = MergeArray.merge(new int[]{1, 0, 0}, 1, new int[]{1, 2}, 2);

        assertThat(mergedArray, equalTo(new int[]{1, 1, 2}));
    }

    @Test
    public void merge_should_return_1_1_2_when_given_array_is_1__2_and_1() {
        int[] mergedArray = MergeArray.merge(new int[]{1, 2, 0}, 2, new int[]{1}, 1);

        assertThat(mergedArray, equalTo(new int[]{1, 1, 2}));
    }

    @Test
    public void merge_should_return_1_1_2_when_given_array_is_1__1_and_2() {
        int[] mergedArray = MergeArray.merge(new int[]{1, 1, 0}, 2, new int[]{2}, 1);

        assertThat(mergedArray, equalTo(new int[]{1, 1, 2}));
    }

    @Test
    public void merge_should_return_1_1_2_3when_given_array_is_1__2_and_1_3() {
        int[] mergedArray = MergeArray.merge(new int[]{1, 2, 0, 0}, 2, new int[]{1, 3}, 2);

        assertThat(mergedArray, equalTo(new int[]{1, 1, 2, 3}));
    }
}