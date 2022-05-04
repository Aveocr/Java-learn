package com.example.App.work4;

public class Task7 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();

        String str = task1.inputString();
        String result = task6.maxUniqueSymbolsInString(str.trim().split("\\s+"));
        System.out.println(result);
    }
}
