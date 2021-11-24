package src.com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        int a;
        int b;
        char sign;
        String repeat;

        Scanner console = new Scanner(System.in);

        do {
            Calculator calculator = new Calculator();

            System.out.println("Введите первое число: ");
            calculator.setA(console.nextInt());

            System.out.println("Введите знак математической операции: ");
            calculator.setSign(console.next().charAt(0));

            System.out.println("Введите второе число: ");
            calculator.setB(console.nextInt());

            calculator.calculat();

            repeat = "";
            while ((!repeat.equals("yes")) && (!repeat.equals("no"))) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                repeat = console.next();
            }
        } while (repeat.equals("yes")); 
    }
}