package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;
    private int calcResult;

    public Calculator(int a, char sign, int b ) {
        this.a = a;
        this.sign = sign;
        this.b = b;
    }

    public int calculat() {
        switch (sign) {
            case ('+') :
                calcResult = Math.addExact(a, b);
                break;
            case ('-') :
                calcResult = Math.subtractExact(a,b);
                break;
            case ('*') :
                calcResult = Math.multiplyExact(a, b);
                break;
            case ('/') :
                calcResult = Math.floorDiv(a, b);
                break;
            case ('^') :
                calcResult = (int) Math.pow(a,b);
                break;
            case ('%') :
                calcResult = Math.floorMod(a, b);
                break;
        }
        return calcResult;
    }
}