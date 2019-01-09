package com.rever.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
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
}