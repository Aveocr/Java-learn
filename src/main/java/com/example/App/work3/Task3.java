package com.example.App.work3;

public class Task3 {
    public static void main(String[] argc) {
        Task1 mainFunction = new Task1();
        Task2 sumRow = new Task2();
        Task3 sumDiagonal = new Task3();
        int[][] matrix = mainFunction.createDoubleArray(10);
        matrix = mainFunction.fillDoubleArrayByRandom(matrix, 10, 100);
        // If main diagonal equal Said diagonal then miltiplication it; =>
        // (15 == 15){true, 1} * sum = sum; else (14 == 15){false, 0} * sum = 0
        int sum = ((sumDiagonal.sumMainDiagonalMatrix(matrix) == sumDiagonal.sumSideDiagonalMatrix(matrix)) ? 1 : 0)
                * sumDiagonal.sumMainDiagonalMatrix(matrix);
        boolean magicSquare = true;

        mainFunction.printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            if (!(sumRow.sumRowDoubleArray(matrix, i) == mainFunction.sumColumnDoubleArray(matrix, i))
                    & !(sumRow.sumRowDoubleArray(matrix, i) == sum)) {
                magicSquare = false;
                break;
            }
        }
        System.out.printf("Is this a magic square? %b", magicSquare);

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
