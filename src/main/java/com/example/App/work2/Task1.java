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

    public int findMaxIndex(int[] arr){
        int max_elem = arr[0];
        int max_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_elem) {
                max_elem = arr[i];
                max_index = i;
            }
        }
        return max_index;
    }

    public int findMinIndex(int[] arr) {
        int min_elem = arr[0];
        int min_index = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min_elem) {
                min_elem = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public int[] replaceMinAndMax(int[] arr, int max_index, int min_index) {
        int c = arr[max_index];
        arr[max_index] = arr[min_index];
        arr[min_index] = c;
        return arr;
    }

    public int averageBetweenMaxMin(int[] arr, int max_index, int min_index) {
        if (min_index > max_index) {
            // a=a+b-(b=a);  Меняем значение двух переменных местами
            min_index = min_index + max_index - (max_index=min_index);
        }
        int sum = 0;
        for (int i = min_index + 1; i < max_index; i++) {
            sum += arr[i];
        }
        return sum / (max_index - min_index - 1);
    }

    public int SumPositiveElem(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] <= 0 ? 0 : arr[i];   // if number is negative then sum + 0 else sum + arr[i]
        }

        return sum;
    }
}



