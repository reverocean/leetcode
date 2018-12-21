package com.rever.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class Sum2Numbers {
    public int[] getIndexesOfNumbers(int[] array, int sum) {
        Map<Integer, Integer> elementWithIndexMap = new HashMap<>();
        for (int i = 1; i <= array.length; i++) {
            elementWithIndexMap.put(array[i - 1], i);
        }

        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 1; i <= array.length; i++) {
            int anotherElement = sum - array[i - 1];
            if (elementWithIndexMap.containsKey(anotherElement)) {
                firstIndex = i;
                secondIndex = elementWithIndexMap.get(anotherElement);
                break;
            }
        }

        if (firstIndex == 0 && secondIndex == 0) {
            return new int[]{};
        }

        if (firstIndex > secondIndex) {
            return new int[]{secondIndex, firstIndex};
        }

        return new int[]{firstIndex, secondIndex};
    }
}
