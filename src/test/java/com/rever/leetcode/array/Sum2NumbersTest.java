package com.rever.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class Sum2NumbersTest {

    private final Sum2Numbers sum2Numbers = new Sum2Numbers();

    @Test
    public void getIndexesOfNumbers_should_return_empty_array_when_the_given_array_is_empty() {
        int[] indexesOfNumbers = sum2Numbers.getIndexesOfNumbers(new int[]{}, 1);
        assertThat(indexesOfNumbers, equalTo(new int[]{}));
    }

    @Test
    public void getIndexesOfNumbers_should_return_empty_array_when_the_given_array_has_one_element_() {
        int[] indexesOfNumbers = sum2Numbers.getIndexesOfNumbers(new int[]{1}, 1);
        assertThat(indexesOfNumbers, equalTo(new int[]{}));
    }


    @Test
    public void getIndexesOfNumbers_should_return_empty_array_when_the_given_array_elements_not_equal_to_sum() {
        int[] indexesOfNumbers = sum2Numbers.getIndexesOfNumbers(new int[]{1, 2}, 1);
        assertThat(indexesOfNumbers, equalTo(new int[]{}));
    }

    @Test
    public void getIndexesOfNumbers_should_return_1_2_when_the_given_array_is_1_2_and_sum_is_3() {
        int[] indexesOfNumbers = sum2Numbers.getIndexesOfNumbers(new int[]{1, 2}, 3);
        assertThat(indexesOfNumbers, equalTo(new int[]{1, 2}));
    }


    @Test
    public void getIndexesOfNumbers_should_return_1_2_when_the_given_array_is_2_7_11_15_and_sum_is_9() {
        int[] indexesOfNumbers = sum2Numbers.getIndexesOfNumbers(new int[]{2, 7, 11, 15}, 9);
        assertThat(indexesOfNumbers, equalTo(new int[]{1, 2}));
    }
}