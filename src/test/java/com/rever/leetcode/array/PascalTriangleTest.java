package com.rever.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PascalTriangleTest {

    @Test
    public void pascalTriangleAt_1_should_return_1() {
        int[] result = PascalTriangle.pascalTriangleAt(1);

        assertThat(result, equalTo(new int[]{1}));
    }

    @Test
    public void pascalTriangleAt_2_should_return_1_1() {
        int[] result = PascalTriangle.pascalTriangleAt(2);

        assertThat(result, equalTo(new int[]{1, 1}));
    }


    @Test
    public void pascalTriangleAt_3_should_return_1_2_1() {
        int[] result = PascalTriangle.pascalTriangleAt(3);

        assertThat(result, equalTo(new int[]{1, 2, 1}));
    }

    @Test
    public void pascalTriangleAt_4_should_return_1_3_3_1() {
        int[] result = PascalTriangle.pascalTriangleAt(4);

        assertThat(result, equalTo(new int[]{1, 3, 3, 1}));
    }


    @Test
    public void pascalTriangleAt_5_should_return_1_4_6_4_1() {
        int[] result = PascalTriangle.pascalTriangleAt(5);

        assertThat(result, equalTo(new int[]{1, 4, 6, 4, 1}));
    }
}