package com.rever.leetcode.array;

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
}
