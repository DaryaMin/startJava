import java.util.*;

public class CalculatorTest {
    public static void main(String[] args) {
        int a;
        int b;
        char sign;
        String repeat;

        Scanner vvod = new Scanner(System.in);

        do {
        Calculator calculatorTest = new Calculator();

        System.out.println("Введите первое число: ");
        calculatorTest.setA(vvod.nextInt());

        System.out.println("Введите знак математической операции: ");
        calculatorTest.setSign(vvod.next().charAt(0));

        System.out.println("Введите второе число: ");
        calculatorTest.setB(vvod.nextInt());

        calculatorTest.calculat();

        repeat = "";
        while ((!repeat.equals("yes")) & (!repeat.equals("no"))) {
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            repeat = vvod.next();
            }
        } while (repeat.equals("yes")); 
    }
}