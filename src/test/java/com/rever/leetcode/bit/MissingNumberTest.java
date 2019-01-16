package com.rever.leetcode.bit;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MissingNumberTest {

    private final MissingNumber missingNumber = new MissingNumber();

    @Test
    public void missingNumberIn_should_return_2_when_given_0_1_3() {
        int num = missingNumber.missingNumberIn(new int[]{0, 1, 3});
        assertThat(num, is(2));
    }


    @Test
    public void missingNumberInByBitSet_should_return_2_when_given_0_1_3() {
        int num = missingNumber.missingNumberInByBitSet(new int[]{0, 1, 2, 4});
        assertThat(num, is(3));
    }

    @Test
    public void missingNumberInByBitSet_should_return_0_when_given_1_2_3() {
        int num = missingNumber.missingNumberInByBitSet(new int[]{1, 2, 3});
        assertThat(num, is(0));
    }
}