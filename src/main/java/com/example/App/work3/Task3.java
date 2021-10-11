package com.example.App.work3;

public class Task3 {
    public static void main(String[] argc) {
        Task1 mainFunction = new Task1();
        int[][] matrix = mainFunction.createDoubleArray(10);
        matrix = mainFunction.fillDoubleArrayByRandom(matrix, 10, 100);
        // If main diagonal equal Said diagonal then miltiplication it; =>
        // (15 == 15){true, 1} * sum = sum; else (14 == 15){false, 0} * sum = 0
        int sum = ((mainFunction.sumMainDiagonalMatrix(matrix) == mainFunction.sumSideDiagonalMatrix(matrix)) ? 1 : 0)
                * mainFunction.sumMainDiagonalMatrix(matrix);
        boolean magicSquare = true;

        mainFunction.printMatrix(matrix);

        for (int i = 0; i < 10; i++) {
            if (!(mainFunction.sumRowDoubleArray(matrix, i) == mainFunction.sumColumnDoubleArray(matrix, i))
                    & !(mainFunction.sumRowDoubleArray(matrix, i) == sum)) {
                magicSquare = false;
                break;
            }
        }
        System.out.printf("Is this a magic square? %b", magicSquare);

    }
}
