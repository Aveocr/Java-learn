package com.example.App.work2;

public class Task2 {
    public static void main(String[] argc) {
        Task1 workWithArray = new Task1();
        Task2 sumPositive = new Task2();
        int[] array = workWithArray.createArray(10);
        array = workWithArray.fillArrayByRandom(array, -50, 50);
        workWithArray.printArray(array);
        System.out.print("\nThe sum of the positive elements of the array is " + sumPositive.SumPositiveElem(array));
    }

    public int SumPositiveElem(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] <= 0 ? 0 : arr[i];   // if number is negative then sum + 0 else sum + arr[i]
        }

        return sum;
    }
}
