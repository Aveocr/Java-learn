package com.example.App.work3;

import java.util.Random;

public class Task1 {
    public static void main(String[] argc) {
        Task1 task1 = new Task1();

        int[][] matrix = task1.createDoubleArray(10);
        matrix = task1.fillDoubleArrayByRandom(matrix, 0, 99);

        for (int i = 0; i < 10; i++) {
            System.out.printf("The column is %d and sum is equal to %d\n", i + 1,
                    task1.sumColumnDoubleArray(matrix, i));
        }
    }

    public int[][] createDoubleArray(int length) {
        return new int[length][length];
    }

    public void printMatrix(int[][] arrw) {
        for (int[] ints : arrw) {
            for (int j = 0; j < arrw.length; j++) {
                System.out.printf("%4d", ints[j]);
            }
            System.out.println();
        }
    }

    public int[][] fillDoubleArrayByRandom(int[][] arrw, int min, int max) {
        Random rnd = new Random();
        // i is column and j is row
        for (int i = 0; i < arrw.length; i++) {
            for (int j = 0; j < arrw[i].length; j++) {
                arrw[i][j] = rnd.nextInt((max - min) + 1) + min;
            }
        }
        return arrw;
    }

    public int sumColumnDoubleArray(int[][] arrw, int column) {
        int sum = 0;
        for (int j = 0; j < arrw[column].length; j++) {
            sum += arrw[column][j];
        }
        return sum;
    }

    public int sumRowDoubleArray(int[][] arrw, int row) {
        int sum = 0;
        for (int[] ints : arrw) {
            sum += ints[row];
        }
        return sum;
    }

    public int sumMainDiagonalMatrix(int[][] arrw) {
        int sum = 0;
        for (int j = 0; j < arrw.length; j++) {
            sum += arrw[j][j];
        }
        return sum;
    }

    public int sumSideDiagonalMatrix(int[][] arrw) {
        int sum = 0;
        for (int j = arrw.length-1; j >= 0; j--) {
            sum += arrw[j][j];
        }
        return sum;
    }

}
