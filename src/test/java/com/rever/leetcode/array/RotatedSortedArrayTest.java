package com.rever.leetcode.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RotatedSortedArrayTest {

    private final RotatedSortedArray rotatedSortedArray = new RotatedSortedArray();

    @Test
    public void findMin_should_return_0_when_given_array_is_empty() {
        int min = rotatedSortedArray.findMin(new int[]{});

        assertThat(min, is(0));
    }

    @Test
    public void findMin_should_return_1_when_given_array_is_1() {
        int min = rotatedSortedArray.findMin(new int[]{1});

        assertThat(min, is(1));
    }


    @Test
    public void findMin_should_return_1_when_given_array_is_1_2() {
        int min = rotatedSortedArray.findMin(new int[]{1, 2});

        assertThat(min, is(1));
    }

    @Test
    public void findMin_should_return_1_when_given_array_is_2_1() {
        int min = rotatedSortedArray.findMin(new int[]{2, 1});

        assertThat(min, is(1));
    }


    @Test
    public void findMin_0_when_given_array_is_0_1_2_3_4_5_6_7() {
        int min = rotatedSortedArray.findMin(new int[]{0, 1, 2, 3, 4, 5, 6, 7});

        assertThat(min, is(0));
    }


    @Test
    public void findMin_0_when_given_array_is_4_5_6_7_0_1_2_3() {
        int min = rotatedSortedArray.findMin(new int[]{4, 5, 6, 7, 0, 1, 2, 3});

        assertThat(min, is(0));
    }

    @Test
    public void findMin_0_when_given_array_is_7_0_1_2_3_4_5_6() {
        int min = rotatedSortedArray.findMin(new int[]{7, 0, 1, 2, 3,4, 5, 6});

        assertThat(min, is(0));
    }

    @Test
    public void findMin_0_when_given_array_is_5_6_7_0_1_2_3() {
        int min = rotatedSortedArray.findMin(new int[]{ 5, 6, 7, 0, 1, 2, 3});

        assertThat(min, is(0));
    }
}