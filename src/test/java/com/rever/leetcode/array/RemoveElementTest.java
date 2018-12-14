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

    @Test
    public void remove_duplicate_element_in_a_sorted_array_should_return_0_when_the_given_array_is_empty(){
        int[] array = new int[]{};

        int length = removeElement.removeDuplicate(array);

        assertThat(length, is(0));
    }

    @Test
    public void remove_duplicate_element_in_a_sorted_array_should_return_1_when_the_given_array_only_one_element(){
        int[] array = new int[]{1};

        int length = removeElement.removeDuplicate(array);

        assertThat(length, is(1));
    }


    @Test
    public void remove_duplicate_element_in_a_sorted_array_should_return_same_length_when_the_given_array_has_not_duplicate_element(){
        int[] array = new int[]{1, 2, 3};

        int length = removeElement.removeDuplicate(array);

        assertThat(length, is(3));
    }

    @Test
    public void remove_duplicate_element_in_a_sorted_array_should_return_2_when_the_given_array_has_duplicate_element(){
        int[] array = new int[]{1, 1, 2};

        int length = removeElement.removeDuplicate(array);

        assertThat(length, is(2));
    }

    @Test
    public void remove_duplicate_element_in_a_sorted_array_should_return_1_when_the_given_array_has_same_elements(){
        int[] array = new int[]{1, 1, 1};

        int length = removeElement.removeDuplicate(array);

        assertThat(length, is(1));
    }

    @Test
    public void remove_more_than_twice_duplicate_element_in_a_sorted_array_should_return_0_when_the_given_array_is_empty(){
        int[] array = new int[]{};

        int length = removeElement.removeMoreThanTwiceDuplicate(array);

        assertThat(length, is(0));
    }

    @Test
    public void remove_more_than_twice_duplicate_element_in_a_sorted_array_should_return_1_when_the_given_array_has_1_element(){
        int[] array = new int[]{1};

        int length = removeElement.removeMoreThanTwiceDuplicate(array);

        assertThat(length, is(1));
    }

    @Test
    public void remove_more_than_twice_duplicate_element_in_a_sorted_array_should_return_2_when_the_given_array_has_2_duplicate_elements(){
        int[] array = new int[]{1, 1};

        int length = removeElement.removeMoreThanTwiceDuplicate(array);

        assertThat(length, is(2));
    }

    @Test
    public void remove_more_than_twice_duplicate_element_in_a_sorted_array_should_return_2_when_the_given_array_has_3_duplicate_elements(){
        int[] array = new int[]{1, 1, 1};

        int length = removeElement.removeMoreThanTwiceDuplicate(array);

        assertThat(length, is(2));
    }

    @Test
    public void remove_more_than_twice_duplicate_element_in_a_sorted_array_should_return_5_when_the_given_array_has_3_duplicate_elements_2_duplicate_elements(){
        int[] array = new int[]{1, 1, 1, 2, 2, 3};

        int length = removeElement.removeMoreThanTwiceDuplicate(array);

        assertThat(length, is(5));
    }
}