package com.example.App.work2;

import com.example.App.work2.Task1;

public class Task2 {
    public static void main(String[] argc) {
        Task1 workWithArray = new Task1();
        int[] array = workWithArray.createArray(10);
        array = workWithArray.fillArrayByRandom(array, -50, 50);
        workWithArray.printArray(array);
        System.out.print("\nThe sum of the positive elements of the array is " + workWithArray.SumPositiveElem(array));
    }
}
