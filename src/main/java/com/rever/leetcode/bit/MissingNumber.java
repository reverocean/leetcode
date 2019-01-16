package com.rever.leetcode.bit;

public class MissingNumber {
    public int missingNumberIn(int[] array) {
        int x = 0;
        for (int i = 0; i <= array.length; i++) {
            x ^= i;
        }
        for (int num : array) {
            x ^= num;
        }
        return x;
    }

    public int missingNumberInByBitSet(int[] array) {
        int bitSet = 0;
        for (int element : array) {
            bitSet |= 1 << element;
        }

        for (int i = 0; i < array.length; i++) {
            if ((bitSet & 1 << i) == 0) {
                return i;
            }
        }

        return 0;
    }
}
