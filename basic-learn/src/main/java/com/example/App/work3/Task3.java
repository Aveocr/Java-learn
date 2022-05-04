package com.example.App.work3;

public class Task3 {
    public static void main(String[] argc) {
        Task1 mainFunction = new Task1();
        Task2 sumColumn = new Task2();
        Task3 sumDiagonal = new Task3();
        int[][] matrix = mainFunction.createDoubleArray(10);
        matrix = mainFunction.fillDoubleArrayByRandom(matrix, 10, 100);

        mainFunction.printMatrix(matrix);
        System.out.printf("Is this a magic square? %s", ((sumDiagonal.checkMagicSquare(matrix) == true) ? "Yes" : "No"));

    }
    public boolean checkMagicSquare(int[][] matrix){
        Task3 sumMainSaidDiagonal = new Task3();
        Task2 sumColumn = new Task2();
        Task1 sumRow = new Task1();
        // If Main diagonal not equal Side diagonal
        if (sumMainSaidDiagonal.sumMainDiagonalMatrix(matrix) != sumMainSaidDiagonal.sumSideDiagonalMatrix(matrix))
            return false;
        // if row not equal column and not equal side diagonal.
        for (int i = 0; i < matrix.length; i++) {
            if ((sumRow.sumRowDoubleArray(matrix, i) != sumColumn.sumColumnDoubleArray(matrix, i))
            | (sumRow.sumRowDoubleArray(matrix, i) != sumMainSaidDiagonal.sumSideDiagonalMatrix(matrix))) {
                return false;
            }
        }
        return true;
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
        int i = 0;
        for (int j = arrw.length-1; j >= 0; j--) {
            sum += arrw[i][j];
            i += 1;
        }
        return sum;
    }

}
