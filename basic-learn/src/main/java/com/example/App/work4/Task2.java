package com.example.App.work4;

public class Task2 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        String str = task1.inputString();
        str = task2.stringUpperCase(str);
        System.out.println(str);
    }

    public String stringUpperCase(String str){
        str = str.replaceAll("[а-яa-z!@#$%^&*()_=+0-9]", "");
        return str;
    }
}
