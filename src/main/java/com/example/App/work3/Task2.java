package com.example.App.work3;

public class Task2 {
    public static void main(String[] argc) {
        Task1 mainFunction = new Task1();
        Task2 sumRow = new Task2();
        int[][] matrix = mainFunction.createDoubleArray(10);
        matrix = mainFunction.fillDoubleArrayByRandom(matrix, 0, 99);
        int[] result = new int[matrix.length];
        for (int j = 0; j < matrix.length; j++) {
            System.out.printf("The row is %d and sum is equal to %d\n", j + 1,
                    sumRow.sumRowDoubleArray(matrix, j));
            result[j] = mainFunction.sumColumnDoubleArray(matrix, j); // запись в массив
        }
    }

    public int sumRowDoubleArray(int[][] arrw, int row) {
        int sum = 0;
        for (int[] ints : arrw) {
            sum += ints[row];
        }
        return sum;
    }

}
