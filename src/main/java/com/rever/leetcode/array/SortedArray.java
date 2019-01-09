package com.rever.leetcode.array;

public class SortedArray {
    public int[] searchRange(int[] array, int target) {
        int[] notFoundResult = {-1, -1};
        if (array.length == 0) {
            return notFoundResult;
        }

        int start = 0;
        int end = array.length - 1;

        int firstIndex = searchIndex(array, start, end, target);
        if (firstIndex == -1) {
            return notFoundResult;
        }

        int temp = firstIndex - 1;
        while (temp >= 0) {
            if (array[temp] == target) {
                firstIndex = temp;
                temp--;
            } else {
                break;
            }
        }


        int secondIndex = searchIndex(array, firstIndex, end, target);
        temp = secondIndex + 1;
        while (temp < array.length) {
            if (array[temp] == target) {
                secondIndex = temp;
                temp++;
            } else {
                break;
            }
        }
        return new int[]{firstIndex, secondIndex};
    }

    private int searchIndex(int[] array, int start, int end, int target) {
        int currentIndex = 0;

        while (start <= end - 1) {
            if (currentIndex == (start + end) / 2) {
                break;
            }
            currentIndex = (start + end) / 2;
            if (target < array[currentIndex]) {
                end = currentIndex;
            } else if (target > array[currentIndex]) {
                start = currentIndex;
            } else {
                return currentIndex;
            }
        }

        return -1;
    }
}
