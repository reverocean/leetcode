package com.rever.leetcode.array;

import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Histogram {
    public int largestRectangle(List<Integer> array) {
        array.add(0);

        List<Integer> stack = newArrayList();

        int sum = 0;
        int i = 0;

        while (i < array.size()) {
            if (stack.isEmpty() || array.get(i) > array.get(getLatest(stack))) {
                stack.add(i);
                i++;
            } else {
                int t = getLatest(stack);
                stack.remove(stack.size() - 1);
                sum = Math.max(sum, array.get(t) * (stack.isEmpty() ? i : i - getLatest(stack) - 1));
            }
        }
        return sum;
    }

    private Integer getLatest(List<Integer> s) {
        return s.get(s.size() - 1);
    }
}
