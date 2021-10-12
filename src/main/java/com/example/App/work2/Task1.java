package com.example.App.work2;

import java.util.Random;

public class Task1 {
    public static void main(String[] argc){
        Task1 task1 = new Task1();
        int[] array = task1.createArray(5);
        array = task1.fillArrayByRandom(array, 10, 99);
        task1.printArray(array);
    }

    public int[] createArray(int size) {
        int[] arr = new int[size];
        return arr;
    }

    public int[] fillArrayByRandom(int[] arr, int minRange, int maxRange) {
        Random random = new Random();
        for (int i=0; i < arr.length; i++){
            arr[i] = random.nextInt(maxRange - minRange + 1) + minRange;
        }
        return arr;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}



