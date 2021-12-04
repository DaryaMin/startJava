package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String repeat;

        do {
            System.out.println("Введите математическое выражение:  ");
            Scanner console = new Scanner(System.in);

            Calculator calculator = new Calculator(console.nextLine());

            System.out.println("Результат вычислений " + calculator.calculate());

            do { System.out.println("Хотите продолжить вычисления? [yes/no]:");
                repeat = console.next();
            } while (!repeat.equals("yes") && !repeat.equals("no"));
        } while (repeat.equals("yes")); 
    }
}