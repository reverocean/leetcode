package com.rever.leetcode.array;

import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RectangleTest {

    private final Rectangle rectangle = new Rectangle();

    @Test
    public void largestRectangle() {
        int largestRectangle = rectangle.largestRectangle(newArrayList(2, 1, 5, 6, 2, 3));

        assertThat(largestRectangle, is(10));
    }
}