package com.example.App.work0;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        App application = new App();
        for (int number = 1; number <= 100; number++) {
            application.fizz_fazz(number);
        }
    }

    public void fizz_fazz(int number) {
        boolean div3 = (number % 3) == 0;
        boolean div5 = (number % 5) == 0;
        if (div3) {
            System.out.print("Fizz ");
        }
        if (div5) {
            System.out.print("Fazz ");
        }
        if (div3 | div5) {
            System.out.print(number);
        }
        System.out.println();
    }
}
