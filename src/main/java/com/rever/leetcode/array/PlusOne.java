package com.rever.leetcode.array;

public class PlusOne {
    public int[] plus(int[] number) {
        int[] result = new int[number.length + 1];
        int sum = getLastDigitPlusOne(number[number.length - 1]);
        for (int i = number.length - 2; i >= 0; i--) {
            if (shouldCarry(sum)) {
                result[i + 2] = sum - 10;
                sum = number[i] + 1;
            } else {
                result[i + 2] = sum;
                sum = number[i];
            }
        }

        if (shouldCarry(sum)) {
            result[1] = sum - 10;
            result[0] = 1;
        } else {
            result[1] = sum;
        }

        return result;
    }

    private boolean shouldCarry(int sum) {
        return sum > 9;
    }

    private int getLastDigitPlusOne(int lastDigit) {
        return lastDigit + 1;
    }
}
