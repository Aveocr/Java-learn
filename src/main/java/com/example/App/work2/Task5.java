package com.example.App.work2;

import com.example.App.work2.Task1;

public class Task5 {
    public static void main(String[] argc) {
        Task1 workWithArray = new Task1();
        Task3 findMinMaxElem = new Task3();
        Task5 averageCount = new Task5();
        int[] array = workWithArray.createArray(10);
        array = workWithArray.fillArrayByRandom(array, 10, 100);
        int min = findMinMaxElem.findMinIndex(array);
        int max = findMinMaxElem.findMaxIndex(array);
        workWithArray.printArray(array);
        int average = averageCount.averageBetweenMaxMin(array, max, min);
        System.out.print("\nThe Average is " + average);
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
}
