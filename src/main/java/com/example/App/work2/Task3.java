package com.example.App.work2;

import com.example.App.work2.Task1;

public class Task3 {
    public static void main(String[] argc) {
        Task1 workWithArray = new Task1();
        Task3 findElement = new Task3();
        int[] array = workWithArray.createArray(10);
        array = workWithArray.fillArrayByRandom(array, 10, 100);
        int min = findElement.findMinIndex(array);
        int max = findElement.findMaxIndex(array);
        workWithArray.printArray(array);
        System.out.println("\nMax number in array to equal is " + array[max]);
        System.out.println("Min number in array to equal is " + array[min]);
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
}
