package com.rever.leetcode.array;

import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        printPascalTriangle(5);
    }

    public static void printPascalTriangle(int n) {
        int[][] array = new int[n][];

        for (int i = 1; i <= n; i++) {
            int[] lineElements = new int[i];
            lineElements[0] = 1;
            for (int j = 1; j < i - 1; j++) {
                lineElements[j] = array[i - 2][j - 1] + array[i - 2][j];
            }
            lineElements[i - 1] = 1;

            array[i - 1] = lineElements;
        }
        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }
    }
}
