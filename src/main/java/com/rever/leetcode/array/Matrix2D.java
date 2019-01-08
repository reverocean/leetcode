package com.rever.leetcode.array;

public class Matrix2D {
    public boolean search(int target, int[][] matrix) {
        if (matrix.length == 0) {
            return false;
        }

        if (matrix[0].length == 0) {
            return false;
        }

        int rowNumber = 0;
        int colNumber = matrix[0].length - 1;
        while (rowNumber < matrix.length && colNumber >= 0) {
            if (target < matrix[rowNumber][colNumber]) {
                --colNumber;
            } else if (target > matrix[rowNumber][colNumber]) {
                ++rowNumber;
            } else {
                return true;
            }
        }
        return false;
    }
}
