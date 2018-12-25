package com.rever.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum3Numbers {
    public List<int[]> threeSumEqual0(int[] array) {
        if (array.length < 3) {
            return Collections.emptyList();
        }

        List<int[]> result = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < array.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }

                    if ((array[i] + array[j] + array[k]) == 0) {
                        result.add(new int[]{array[i], array[j], array[k]});
                    }
                }
            }
        }

        return result;
    }

    public List<int[]> threeSumEqual0Simple(int[] array) {
        if (array.length < 3) {
            return Collections.emptyList();
        }

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < array.length - 2; i++) {
            int j = i + 1;
            int k = array.length - 1;
            int[] subArray = new int[3];
            while (j < k) {
                int sum = array[i] + array[j] + array[k];
                if(sum == 0){
                    subArray[0] = array[i];
                    subArray[1] = array[j];
                    subArray[2] = array[k];

                    result.add(subArray);
                    ++j;
                    --k;

                    //因为数组里有重复的元素，
                    while (j < k && array[j - 1] == array[j]){
                        ++j;
                    }

                    while (j < k && array[k] == array[k + 1]){
                        --k;
                    }
                } else if (sum < 0) {
                    //因为排过序，所以当和小于0的时候，就要往大里取数
                    ++j;
                } else {
                    //因为排过序，所以当和大于0的时候，就要往小里取数
                    --k;
                }
            }
        }

        return result;
    }
}
