package com.rever.leetcode.array;

public class SortedArray {

    public int[] searchRangeNew(int[] array, int target) {
        int[] notFoundResult = {-1, -1};
        int length = array.length;
        if (length == 0) {
            return notFoundResult;
        }

        int[] result = new int[2];
        int low = 0;
        int high = length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (low < length && array[low] == target) {
            result[0] = low;
        } else {
            return notFoundResult;
        }
        high = length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        result[1] = high;

        return result;
    }

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
        int currentIndex = start + (end - start) / 2;

        while (start < end && currentIndex > start) {
            if (currentIndex == start) {
                break;
            }
            if (target < array[currentIndex]) {
                end = currentIndex;
            } else if (target > array[currentIndex]) {
                start = currentIndex;
            } else {
                return currentIndex;
            }
            currentIndex = start + (end - start) / 2;
        }

        return -1;
    }
}
