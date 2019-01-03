package com.rever.leetcode.array;

import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Rectangle {
    public int largestRectangle(List<Integer> height) {
        height.add(0);

        List<Integer> s = newArrayList();

        int sum = 0;
        int i = 0;

        while (i < height.size()) {
            if (s.isEmpty() || height.get(i) > height.get(s.get(s.size() - 1))) {
                s.add(i);
                i++;
            } else {
                int t = s.get(s.size() - 1);
                s.remove(s.size() - 1);
                sum = Math.max(sum, height.get(t) * (s.isEmpty() ? i : i - s.get(s.size() - 1) - 1));
            }
        }
        return sum;
    }
}
