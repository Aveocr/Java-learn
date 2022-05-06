package com.example.App.work4;

import java.util.Scanner;

/*
Напишите метод, который получает в качестве параметра строку и возвращает массив из следующих элементов:
первый символ строки;
два первых символа;
три первых символа и так далее.
 */
public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String str = task1.inputString();

        String[] result = task1.stringArray(str);
        task1.printStringArray(result);
    }

    public String inputString(){
        Scanner string = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = string.nextLine();
        return str;
    }

    public String[] stringArray(String str){
        String[] result = new String[str.length()];
        for (int i = 0; i < str.length(); i++){
            result[i] = str.substring(0,i+1);
        }
        return result;
    }

    public void printStringArray(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
