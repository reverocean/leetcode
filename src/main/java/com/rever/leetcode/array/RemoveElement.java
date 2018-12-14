package com.rever.leetcode.array;

import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] array, int removeValue) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == removeValue) {
                continue;
            }

            array[index] = array[i];
            index++;
        }

        return index;
    }


    public int removeDuplicate(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int lastElement = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == lastElement) {
                continue;
            }

            array[index] = array[i];
            lastElement = array[i];
            index++;
        }

        return index;
    }

    public int removeMoreThanTwiceDuplicate(int[] array) {
        if (array.length < 3) {
            return array.length;
        }

        int lastElement = array[0];
        int index = 0;
        int duplicateCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == lastElement && duplicateCount <2) {
                duplicateCount++;
                index++;
                continue;
            }

            array[index] = array[i];
            lastElement = array[i];
            index++;
            duplicateCount = 0;
        }
        System.out.println(Arrays.toString(array));
        return index;
    }
}
