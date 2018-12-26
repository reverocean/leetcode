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
    public void threeSumEqual0_should_return_emtpy_when_the_given_array_have_not_sub_array_sum_equals_0() {
        int[] array = new int[]{1, 2, 3};

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
    public void threeSumEqual0Simple_should_return_emtpy_when_the_given_array_have_not_sub_array_sum_equals_0() {
        int[] array = new int[]{1, 2, 3};

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


    @Test
    public void closeToTarget_should_return_empty_when_the_given_array_is_less_than_three(){
        int[] array = new int[]{1, 2};

        int[] result = sum3Numbers.closeToTarget(array, 0);

        assertThat(result.length, is(0));
    }

    @Test
    public void closeToTarget_should_return_1_2_3_when_the_given_array_is_1_2_3_and_target_is_0(){
        int[] array = new int[]{1, 2, 3};

        int[] result = sum3Numbers.closeToTarget(array, 0);

        assertThat(result, equalTo(new int[]{1, 2, 3}));
    }


    @Test
    public void closeToTarget_should_return_1_2_3_when_the_given_array_is_1_2_3_4_5_and_target_is_6(){
        int[] array = new int[]{1, 2, 3, 4, 5};

        int[] result = sum3Numbers.closeToTarget(array, 6);

        assertThat(result, equalTo(new int[]{1, 2, 3}));
    }

    @Test
    public void closeToTarget_should_return_2_3_4_when_the_given_array_is_1_2_3_5_7_and_target_is_9(){
        int[] array = new int[]{1, 2, 3, 5, 7};

        int[] result = sum3Numbers.closeToTarget(array, 9);

        assertThat(result, equalTo(new int[]{1, 3, 5}));
    }

    @Test
    public void closeToTarget_should_return_3_4_5_when_the_given_array_is_1_2_3_4_5_and_target_is_13(){
        int[] array = new int[]{1, 2, 3, 4, 5};

        int[] result = sum3Numbers.closeToTarget(array, 13);

        assertThat(result, equalTo(new int[]{3, 4, 5}));
    }
}