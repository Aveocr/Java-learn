package com.example.App.work1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] argc) {
        Scanner prime_number = new Scanner(System.in);
        try {
            Task3 task = new Task3();
            System.out.print("Enter the number: ");
            int number = prime_number.nextInt();
            if (task.checkPrimeNumber(number)) {
                System.out.println(number + " is prime number! ");
            } else {
                System.out.println(number + " is not prime number! ");
            }
        } finally {
            prime_number.close();
        }
    }

    public boolean checkPrimeNumber(int number) {
        for (int i = 2; i <= Math.round(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
