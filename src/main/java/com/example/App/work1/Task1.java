package com.example.App.work1;

import java.util.Scanner;

/*
* @author Aveocr
*/
public class Task1 {
    public static void main(String[] args) {

        Task1 task = new Task1();
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Input six figures: ");
            int inputValue = input.nextInt();
            boolean result = task.isLucky(inputValue);
            System.out.print("Happy number is " + result);
        } finally {
            input.close(); // закрыватие ввода
        }
    }

    public boolean isLucky(int number) {
        int sum = 0;
        // Прогоняем число по алгоритму
        for (int j = 0; j < 80; j++) {
            for (int i = 0; i < 6; i++) {
                sum += ((number % 10) * (number % 10));
                number /= 10;
            }
            if (sum == 1) {
                return true; // число счастливое
            }
            number = sum;
            sum = 0;
        }
        return false; // количество повторение превысило 80, число не счастливое
    }
}
