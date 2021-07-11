package com.bogdan.task9;

import java.util.Arrays;

public class OptimizedBubbleSort {

    public static void main(String[] args) {

        int[] arr = {4,7,12,1,3,2,34,9,14,21,86,38,44};

        System.out.println(Arrays.toString(arr));
        optimizedBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void optimizedBubbleSort(int[] arr) {
        int lastSwap = arr.length - 1;
        for (int i = 1; i < arr.length; i++) {
            boolean isSorted = true;
            int curSwap = 0;
            for (int j = 0; j < lastSwap; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                    curSwap = j;
                }
            }
            if (isSorted) {
                return;
            }
            lastSwap = curSwap;
        }
    }
}
