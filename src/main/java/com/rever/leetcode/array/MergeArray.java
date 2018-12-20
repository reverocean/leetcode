package com.rever.leetcode.array;

public class MergeArray {
    public static int[] merge(int[] arrayA, int m, int[] arrayB, int n) {
        int newArrayIndex = m + n - 1;
        int arrayAIndex = m - 1;
        int arrayBIndex = n - 1;

        while (arrayAIndex >= 0 || arrayBIndex >= 0) {

            if (arrayAIndex < 0 || (arrayBIndex >= 0 && arrayA[arrayAIndex] < arrayB[arrayBIndex])) {
                arrayA[newArrayIndex] = arrayB[arrayBIndex];
                arrayBIndex--;
            } else {
                arrayA[newArrayIndex] = arrayA[arrayAIndex];
                arrayAIndex--;
            }
            newArrayIndex--;
        }
        return arrayA;
    }
}
