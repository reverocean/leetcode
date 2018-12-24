package com.rever.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum3Numbers {
    public List<int[]> threeSumEqual0(int[] array) {
        if (array.length < 3) {
            return Collections.emptyList();
        }

        List<int[]> result = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < array.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }

                    if ((array[i] + array[j] + array[k]) == 0) {
                        result.add(new int[]{array[i], array[j], array[k]});
                    }
                }
            }
        }

        return result;
    }
}
