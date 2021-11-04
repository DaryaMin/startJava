public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        char sign = '/';
        int calcResult;

        if (sign == '+') {
            calcResult = a + b;
            System.out.println("Выполняется операция сложения:");
            System.out.println(a + " + " + b + " = " + calcResult);
        } else if (sign == '-') {
            calcResult = a - b;
            System.out.println("Выполняется операция вычитания:");
            System.out.println(a + " - " + b + " = " + calcResult);
        } else if (sign == '*') {
            calcResult = a * b;
            System.out.println("Выполняется операция умножения:");
            System.out.println(a + " * " + b + " = " + calcResult);
        } else if (sign == '/') {
            calcResult = a / b;
            System.out.println("Выполняется операция деления:");
            System.out.println(a + " / " + b + " = " + calcResult);
        } else if (sign == '^') {
            calcResult = a - b;
            int i = 2;
            calcResult = a;
            while (i <= b) {
                calcResult = calcResult * a;
                i++;
            }
            System.out.println("Выполняется операция возведения в степень:");
            System.out.println(a + " ^ " + b + " = " + calcResult);
        } else if (sign == '%') {
            calcResult = a % b;
            System.out.println("Выполняется операция определения остатка от деления:");
            System.out.println(a + " % " + b + " = " + calcResult);
        }
    }
}