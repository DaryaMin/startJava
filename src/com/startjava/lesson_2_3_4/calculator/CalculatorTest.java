package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String repeat;

        do {
            System.out.println("Введите математическое выражение:  ");
            Scanner console = new Scanner(System.in);
            String inputString = console.nextLine();
            String[] inputArray = inputString.split(" ");

            Calculator calculator = new Calculator(Integer.parseInt(inputArray[0]), inputArray[1].charAt(0), Integer.parseInt(inputArray[2]));

            System.out.println("Результат вычислений " + calculator.calculat());

            repeat = "";
            while ((!repeat.equals("yes")) && (!repeat.equals("no"))) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                repeat = console.next();
            }
        } while (repeat.equals("yes")); 
    }
}