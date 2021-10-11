package com.example.App.work3;

public class Task4 {
    public static void main(String[] argc) {
        Task1 functionMain = new Task1();
        Task4 functionForSorted = new Task4();
        int[][] matrix = new int[10][10];
        matrix = functionMain.fillDoubleArrayByRandom(matrix, 0, 99);
        int[] array = functionForSorted.convertMatrixToArrya(matrix);
        array = functionForSorted.mergeSort(array);
        matrix = functionForSorted.convertArrayToMatrix(array);
        functionMain.printMatrix(matrix);
    }

    public int[] convertMatrixToArrya(int[][] matrix){
        int[] array = new int[matrix[0].length * matrix.length];
        int count = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                array[count] = matrix[i][j];
                count+=1;
            }
        }
        return array;
    }

    public int[][] convertArrayToMatrix(int[] array) {
        int[][] matrix = new int[10][10];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = array[count];
                count+=1;
            }
        }
        return matrix;
    }

    public int[] mergeSort(int[] array) {
        int minIndex, buff;
        Task4 findMinNumber = new Task4();
        for (int i = 0; i < array.length; i++) {
            minIndex = findMinNumber.findMinIndex(array, i);
            buff = array[i];
            array[i] = array[minIndex];
            array[minIndex] = buff;
        }
        return array;
    }

    public int findMinIndex(int[] arr, int start_elem) {
        int min_elem = arr[start_elem];
        int min_index = start_elem;
        for(int i = start_elem; i < arr.length; i++){
            if (arr[i] < min_elem) {
                min_elem = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }
}
