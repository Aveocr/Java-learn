package com.example.App.work3;

public class Task2 {
    public static void main(String[] argc) {
        Task1 mainFunction = new Task1();
        int[][] matrix = mainFunction.createDoubleArray(10);
        matrix = mainFunction.fillDoubleArrayByRandom(matrix, 0, 99);

        for (int j = 0; j < 10; j++) {
            System.out.printf("The row is %d and sum is equal to %d\n", j + 1,
                    mainFunction.sumRowDoubleArray(matrix, j));
        }
    }
}
