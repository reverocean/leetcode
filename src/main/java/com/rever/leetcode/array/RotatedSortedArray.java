package com.rever.leetcode.array;

public class RotatedSortedArray {
    public int findMin(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.min(array[0], array[1]);
        }
        return findMin(array, 0, array.length - 1);
    }

    private int findMin(int[] array, int start, int end) {
        if (array[start] < array[end]) {
            return array[start];
        }

        if ((end - start) == 1) {
            return Math.min(array[start], array[end]);
        }

        int midIndex = start + (end - start) / 2;

        if (array[start] < array[midIndex]) {
            return findMin(array, midIndex, end);
        } else {
            return findMin(array, start, midIndex);
        }
    }
}
