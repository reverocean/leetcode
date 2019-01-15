package com.rever.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortedArrayTest {

    private final SortedArray sortedArray = new SortedArray();

    @Test
    public void searchRange_should_return_not_found_result_when_given_array_is_empty_and_given_target_is_9() {
        int[] range = sortedArray.searchRange(new int[]{}, 9);

        assertThat(range, equalTo(new int[]{-1, -1}));
    }

    @Test
    public void searchRange_should_return_not_found_result_when_given_array_is_5_7_7_8_8_10_and_given_target_is_9() {
        int[] range = sortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 9);

        assertThat(range, equalTo(new int[]{-1, -1}));
    }


    @Test
    public void searchRange_should_return_3_4_when_given_array_is_5_7_7_8_8_10_and_given_target_is_8() {
        int[] range = sortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);

        assertThat(range, equalTo(new int[]{3, 4}));
    }

    @Test
    public void searchRange_should_return_1_2_when_given_array_is_5_7_7_8_8_10_and_given_target_is_7() {
        int[] range = sortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7);

        assertThat(range, equalTo(new int[]{1, 2}));
    }
    @Test
    public void searchRange_should_return_1_3_when_given_array_is_5_7_7_7_8_8_10_and_given_target_is_7() {
        int[] range = sortedArray.searchRange(new int[]{5, 7, 7,7, 8, 8, 10}, 7);

        assertThat(range, equalTo(new int[]{1, 3}));
    }


    @Test
    public void searchRangeNew_should_return_not_found_result_when_given_array_is_empty_and_given_target_is_9() {
        int[] range = sortedArray.searchRangeNew(new int[]{}, 9);

        assertThat(range, equalTo(new int[]{-1, -1}));
    }

    @Test
    public void searchRangeNew_should_return_not_found_result_when_given_array_is_5_7_7_8_8_10_and_given_target_is_9() {
        int[] range = sortedArray.searchRangeNew(new int[]{5, 7, 7, 8, 8, 10}, 9);

        assertThat(range, equalTo(new int[]{-1, -1}));
    }


    @Test
    public void searchRangeNew_should_return_3_4_when_given_array_is_5_7_7_8_8_10_and_given_target_is_8() {
        int[] range = sortedArray.searchRangeNew(new int[]{5, 7, 7, 8, 8, 10}, 8);

        assertThat(range, equalTo(new int[]{3, 4}));
    }

    @Test
    public void searchRangeNew_should_return_1_2_when_given_array_is_5_7_7_8_8_10_and_given_target_is_7() {
        int[] range = sortedArray.searchRangeNew(new int[]{5, 7, 7, 8, 8, 10}, 7);

        assertThat(range, equalTo(new int[]{1, 2}));
    }

    @Test
    public void findIndexOrInsertIndex_should_return_minus_1_when_the_given_array_is_empty(){
        int indexOrInsertIndex = sortedArray.findIndexOrInsertIndex(new int[]{}, 0);

        assertThat(indexOrInsertIndex, is(-1));
    }

    @Test
    public void findIndexOrInsertIndex_should_return_2_when_the_given_array_is_1_3_5_6_and_the_element_is_5(){
        int indexOrInsertIndex = sortedArray.findIndexOrInsertIndex(new int[]{1, 3, 5, 6}, 5);

        assertThat(indexOrInsertIndex, is(2));
    }

    @Test
    public void findIndexOrInsertIndex_should_return_1_when_the_given_array_is_1_3_5_6_and_the_element_is_2(){
        int indexOrInsertIndex = sortedArray.findIndexOrInsertIndex(new int[]{1, 3, 5, 6}, 2);

        assertThat(indexOrInsertIndex, is(1));
    }
    @Test
    public void findIndexOrInsertIndex_should_return_4_when_the_given_array_is_1_3_5_6_and_the_element_is_7(){
        int indexOrInsertIndex = sortedArray.findIndexOrInsertIndex(new int[]{1, 3, 5, 6}, 7);

        assertThat(indexOrInsertIndex, is(4));
    }

    @Test
    public void findIndexOrInsertIndex_should_return_0_when_the_given_array_is_1_3_5_6_and_the_element_is_0(){
        int indexOrInsertIndex = sortedArray.findIndexOrInsertIndex(new int[]{1, 3, 5, 6}, 0);

        assertThat(indexOrInsertIndex, is(0));
    }

    @Test
    public void findIndexOrInsertIndex_should_return_3_when_the_given_array_is_1_3_5_6_and_the_element_is_6(){
        int indexOrInsertIndex = sortedArray.findIndexOrInsertIndex(new int[]{1, 3, 5, 6}, 6);

        assertThat(indexOrInsertIndex, is(3));
    }
}