package com.rever.leetcode.array;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Sum3NumbersTest {

    private final Sum3Numbers sum3Numbers = new Sum3Numbers();

    @Test
    public void threeSumEqual0_should_return_emtpy_when_the_given_array_less_than_3_element() {
        int[] array = new int[]{1, 2};

        List<int[]> result = sum3Numbers.threeSumEqual0(array);

        assertThat(result.isEmpty(), is(true));
    }

    @Test
    public void threeSumEqual0_should_return_sorted_three_elements_the_sum_of_them_equal_to_0_when_the_given_array() {
        int[] array = new int[]{-2, -1, 3};

        List<int[]> result = sum3Numbers.threeSumEqual0(array);

        assertThat(result.isEmpty(), is(false));
        int[] elements = result.get(0);

        assertThat(elements, equalTo(new int[]{-2, -1, 3}));

    }

    @Test
    public void threeSumEqual0Simple_should_return_emtpy_when_the_given_array_less_than_3_element() {
        int[] array = new int[]{1, 2};

        List<int[]> result = sum3Numbers.threeSumEqual0Simple(array);

        assertThat(result.isEmpty(), is(true));
    }

    @Test
    public void threeSumEqual0Simple_should_return_sorted_three_elements_the_sum_of_them_equal_to_0_when_the_given_array() {
        int[] array = new int[]{-2, -1, 3};

        List<int[]> result = sum3Numbers.threeSumEqual0Simple(array);

        assertThat(result.isEmpty(), is(false));
        int[] elements = result.get(0);

        assertThat(elements, equalTo(new int[]{-2, -1, 3}));

    }


}