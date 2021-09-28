package com.example.App.work1;

public class Task4 {
    public static void main(String[] argc) {
        Task3 task = new Task3();
        int sum = 0;
        for (int i = 1000; i < 2000; i++) {
            if (task.checkPrimeNumber(i)) {
                sum += i;
            }
        }
        System.out.println("The sum of all primes from 1000 to 2000 is equal to " + sum);
    }
}
