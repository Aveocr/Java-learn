package com.example.App.work4;

import java.util.Scanner;

/*
Напишите метод, который получает в качестве параметра строку и возвращает массив из следующих элементов:
первый символ строки;
два первых символа;
три первых символа и так далее.
 */
public class Task1 {
    public static void main(String[] argc) {
        Task1 printPyramid = new Task1();
        Scanner str = new Scanner(System.in);
        printPyramid.printPyramidString(str.nextLine());
    }

    public void printPyramidString(String charset){
        for (int i =1;i<charset.length(); i++) {
            System.out.println("charset.substring(1, " + i + ") = " + charset.substring(0, i));
        }
    }
}
