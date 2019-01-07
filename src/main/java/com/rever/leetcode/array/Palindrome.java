package com.rever.leetcode.array;

public class Palindrome {

    /**
     * 判断数字是不是回文
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }

        int temp = x;
        int y = 0;

        /**
         * 每一轮循环都是：
         * y = 上一轮的y值乘以10 + 上一轮x值模10的余数
         * x = 上一轮x值除以10
         * 这样，就会把y值一步一步的变成原始的x
         */
        while (x != 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }

        return temp == y;
    }
}
