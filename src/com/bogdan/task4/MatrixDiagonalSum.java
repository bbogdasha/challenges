package com.bogdan.task4;

public class MatrixDiagonalSum {

    private static final int[][] input1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};

    private static final int[][] input2 = {
            {2,1,1,3},
            {1,2,3,1},
            {1,3,2,1},
            {3,1,1,2}};

    private static final int[][] input3 = {
            {5}};

    public static void main(String[] args) {
        System.out.println(diagonalSum(input1));
        System.out.println(diagonalSum(input2));
        System.out.println(diagonalSum(input3));
    }

    private static int diagonalSum(int[][] arr) {
        int n = arr[0].length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i][i] + arr[i][n - 1 - i];
        }
        return n % 2 == 0 ? sum : sum - arr[n / 2][n / 2];
    }
}
