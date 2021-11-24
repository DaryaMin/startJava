package src.com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;
    private int calcResult;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculat() {
        switch (sign) {
            case ('+') :
                calcResult = a + b;
                break;
            case ('-') :
                calcResult = a - b;
                break;
            case ('*') :
                calcResult = a * b;
                break;
            case ('/') :
                calcResult = a / b;
                break;
            case ('^') :
                int i = 2;
                calcResult = a;
                while (i <= b) {
                    calcResult *= a;
                    i++;
                }
                break;
            case ('%') :
                calcResult = a % b;
                break;
        }
        System.out.println(a + " " + sign + " " + b + " = " + calcResult);
    }
}