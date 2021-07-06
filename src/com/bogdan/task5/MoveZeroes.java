package com.bogdan.task5;

import java.util.Arrays;

public class MoveZeroes {

    static final int[] input1 = {0,1,0,3,12};
    static final int[] input2 = {3,0,0,1,-2};
    static final int[] input3 = {0};

    public static void main(String[] args) {
        System.out.println("Not moved: " + Arrays.toString(input1));
        moveZeroes(input1);
        System.out.println("Moved: " + Arrays.toString(input1) + "\n");

        System.out.println("Not moved: " + Arrays.toString(input2));
        moveZeroes(input2);
        System.out.println("Moved: " + Arrays.toString(input2) + "\n");

        System.out.println("Not moved: " + Arrays.toString(input3));
        moveZeroes(input3);
        System.out.println("Moved: " + Arrays.toString(input3) + "\n");
    }

    private static void moveZeroes(int[] arr) {
        int zeroes = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[zeroes++] = arr[i];
            }
        }
        while (zeroes < arr.length) {
            arr[zeroes++] = 0;
        }
    }
}
