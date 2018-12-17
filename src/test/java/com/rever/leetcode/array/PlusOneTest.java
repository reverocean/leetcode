package com.rever.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PlusOneTest {

    private PlusOne plusOne = new PlusOne();

    @Test
    public void plus_one_should_return_9_when_the_given_number_is_8() {
        int[] number = new int[]{8};

        int[] result = plusOne.plus(number);

        assertThat(result, equalTo(new int[]{0, 9}));
    }

    @Test
    public void plus_one_should_return_10_when_the_given_number_is_9() {
        int[] number = new int[]{9};

        int[] result = plusOne.plus(number);

        assertThat(result, equalTo(new int[]{1, 0}));
    }

    @Test
    public void plus_one_should_return_100_when_the_given_number_is_99() {
        int[] number = new int[]{9, 9};

        int[] result = plusOne.plus(number);

        assertThat(result, equalTo(new int[]{1, 0, 0}));
    }

    @Test
    public void plus_one_should_return_98_when_the_given_number_is_97() {
        int[] number = new int[]{9, 7};

        int[] result = plusOne.plus(number);

        assertThat(result, equalTo(new int[]{0, 9, 8}));
    }
}