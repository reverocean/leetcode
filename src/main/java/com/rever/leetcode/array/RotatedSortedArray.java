package com.rever.leetcode.array;

public class RotatedSortedArray {
    public int findMinLoop(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.min(array[0], array[1]);
        }

        int start = 0;
        int end = array.length - 1;

        while (start < end - 1) {
            if (array[start] < array[end]) {
                return array[start];
            }

            int mid = start + (end - start) / 2;

            if (array[start] < array[mid]) {
                start = mid;
            } else {
                end = mid;
            }
        }

        return Math.min(array[start], array[end]);
    }

    public int findMinRecursion(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.min(array[0], array[1]);
        }
        return findMinRecursion(array, 0, array.length - 1);
    }

    public int findMinRecursionInHaveDuplicate(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.min(array[0], array[1]);
        }
        return findMinRecursionInHaveDuplicate(array, 0, array.length - 1);
    }

    private int findMinRecursion(int[] array, int start, int end) {
        if (array[start] < array[end]) {
            return array[start];
        }

        if ((end - start) == 1) {
            return Math.min(array[start], array[end]);
        }

        int midIndex = start + (end - start) / 2;

        if (array[start] < array[midIndex]) {
            return findMinRecursion(array, midIndex, end);
        } else {
            return findMinRecursion(array, start, midIndex);
        }
    }

    private int findMinRecursionInHaveDuplicate(int[] array, int start, int end) {
        if (array[start] < array[end]) {
            return array[start];
        }

        if ((end - start) == 1) {
            return Math.min(array[start], array[end]);
        }

        while (start < end - 1) {
            if (array[start] == array[start + 1]) {
                start++;
            } else {
                break;
            }
        }

        int midIndex = start + (end - start) / 2;

        if (array[start] < array[midIndex]) {
            return findMinRecursion(array, midIndex, end);
        } else {
            return findMinRecursion(array, start, midIndex);
        }
    }
}
