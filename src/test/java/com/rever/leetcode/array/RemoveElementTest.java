package com.rever.leetcode.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RemoveElementTest {
    private RemoveElement removeElement = new RemoveElement();

    @Test
    public void remove_element_should_return_0_when_the_given_array_is_empty() {
        int length = removeElement.removeElement(new int[]{}, 2);
        assertThat(length, is(0));
    }

    @Test
    public void remove_element_should_return_origin_array_length_when_the_remove_value_is_not_exist_in_the_array() {
        int[] array = new int[]{1, 2, 2, 3, 2, 4};
        int removeValue = 5;

        int length = removeElement.removeElement(array, removeValue);
        assertThat(length, is(6));
    }

    @Test
    public void remove_element_should_return_0_when_the_given_array_contains_the_same_values_as_remove_value() {
        int[] array = new int[]{2, 2, 2 ,2 };
        int removeValue = 2;

        int length = removeElement.removeElement(array, removeValue);
        assertThat(length, is(0));
    }

    @Test
    public void remove_element_should_return_3_when_the_given_array_is_1_2_2_3_2_4_and_remove_2() {
        int[] array = new int[]{1, 2, 2, 3, 2, 4 };
        int removeValue = 2;

        int length = removeElement.removeElement(array, removeValue);
        assertThat(length, is(3));
    }
}