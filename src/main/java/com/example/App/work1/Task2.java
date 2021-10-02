package com.example.App.work1;

/*
* @author Aveocr
*/
public class Task2 {
    public static void main(String[] argc) {

        Task2 task2 = new Task2();
        System.out.print("The sum of all the happy numbers is equal to " + task2.isSumHappyNumber());

    }

    public int isSumHappyNumber() {
        Task1 task = new Task1();
        int sum = 0;
        for (int i = 100000; i <= 999999; i++) {
            if (task.isLucky(i) == true) {
                sum += i;
            }
        }
        return sum;
    }

}
