package com.example.App.work3;

public class Task2 {
    public static void main(String[] argc) {
        Task1 mainFunction = new Task1();
        Task2 sumRow = new Task2();
        int[][] matrix = mainFunction.createDoubleArray(10);
        matrix = mainFunction.fillDoubleArrayByRandom(matrix, 0, 99);
        int[] result = new int[matrix.length];
        for (int j = 0; j < matrix.length; j++) {
            result[j] = mainFunction.sumRowDoubleArray(matrix, j); // запись в массив
        }
        for (int j=0; j < result.length; j++) {
            System.out.printf("The column is %d and sum is equal to %d\n", j, result[j]);
        }
    }

    public int sumColumnDoubleArray(int[][] arrw, int row) {
        int sum = 0;
        for (int[] ints : arrw) {
            sum += ints[row];
        }
        return sum;
    }
}
