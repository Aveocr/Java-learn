package com.example.App.work0;

import java.util.Scanner;

/**
 * @author rassafel
 */
public class Task1_example {
    public static void main(String[] args) {
        Task1_example task = new Task1_example();
        Scanner input = new Scanner(System.in);
        //
        try {
            System.out.print("Input number: ");
            int inputValue = input.nextInt();
            System.out.println(task.isEven(inputValue));
        } finally {
            input.close(); // закрыли ввод
        }
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}