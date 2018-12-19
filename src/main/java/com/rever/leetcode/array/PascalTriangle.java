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

    /**
     * 因为需要O(n)的空间复杂度，所以不能像上面那样，弄个二维数组来计算，只能申明一个一纬数组重用
     * 从上面的print函数我们可以知道，第n行第k个数的值是由：array[n][k] = array[n-1][k-1] + array[n-1][k]
     * 如果按照顺序计算，第n行的第k个值会把n-1行的k值替换了，再计算下一个数字的时候，就不正确了
     * 不过，好在在计算第n行第k值的时候，需要的是上一行的第k-1和第k个数，所以，如果我们从后往前计算，就可以了
     * @param n
     * @return
     */

    public static int[] pascalTriangleAt(int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[0] = 1;
            result[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                result[j] = result[j - 1] + result[j];
            }
        }
        return result;
    }
}
