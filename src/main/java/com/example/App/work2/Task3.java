package com.example.App.work2;

import com.example.App.work2.Task1;

public class Task3 {
    public static void main(String[] argc) {
        Task1 workWithArray = new Task1();
        int[] array = workWithArray.createArray(10);
        array = workWithArray.fillArrayByRandom(array, 10, 100);
        int min = workWithArray.findMinIndex(array);
        int max = workWithArray.findMaxIndex(array);
        workWithArray.printArray(array);
        System.out.println("\nMax number in array to equal is " + array[max]);
        System.out.println("Min number in array to equal is " + array[min]);
    }
}
