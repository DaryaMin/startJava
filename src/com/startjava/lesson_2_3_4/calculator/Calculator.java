package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;

    public Calculator(String mathExpression) {
        String[] splittedExpression = mathExpression.split(" ");
        this.a = Integer.parseInt(splittedExpression[0]);
        this.sign = splittedExpression[1].charAt(0);
        this.b = Integer.parseInt(splittedExpression[2]);
    }

    public int calculate() {
        switch (sign) {
            case ('+'):
                return Math.addExact(a, b);
            case ('-'):
                return Math.subtractExact(a, b);
            case ('*'):
                return Math.multiplyExact(a, b);
            case ('/'):
                return Math.floorDiv(a, b);
            case ('^'):
                return (int) Math.pow(a, b);
            case ('%'):
                return Math.floorMod(a, b);
        }
        return 0;
    }
}