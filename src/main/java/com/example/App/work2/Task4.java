package com.example.App.work2;

import com.example.App.work2.Task1;

public class Task4 {
    public static void main(String[] argc) {
        Task1 workWithArray = new Task1();
        Task3 findMinMaxElem = new Task3();
        Task4 replace = new Task4();
        int[] array = workWithArray.createArray(10);
        array = workWithArray.fillArrayByRandom(array, 10, 100);
        int min = findMinMaxElem.findMinIndex(array);
        int max = findMinMaxElem.findMaxIndex(array);
        workWithArray.printArray(array);
        array = replace.replaceMinAndMax(array, max, min);
        System.out.println("\nAnd we get ...");
        workWithArray.printArray(array);
    }

    public int[] replaceMinAndMax(int[] arr, int max_index, int min_index) {
        int c = arr[max_index];
        arr[max_index] = arr[min_index];
        arr[min_index] = c;
        return arr;
    }
}