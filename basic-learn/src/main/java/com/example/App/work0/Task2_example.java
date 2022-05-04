package com.example.App.work0;

/**
 * @author rassafel
 */
public class Task2_example {
    public static void main(String[] args) {
        Task2_example task = new Task2_example();

        System.out.println(task.sumEvenNumbers(1, 1000));
    }

    public int sumEvenNumbers(int start, int end) {
        Task1_example task1 = new Task1_example();
        int result = 0;
        for (int number = start; number < end; number++) {
            if (task1.isEven(number)) {
                result += number;
            }
        }
        return result;
    }
}