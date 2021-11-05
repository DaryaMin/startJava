public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        char sign = '/';
        int calcResult;

        System.out.println("Выполняется операция " + sign);

        if (sign == '+') {
            calcResult = a + b;
            System.out.println(a + " + " + b + " = " + calcResult);
        } else if (sign == '-') {
            calcResult = a - b;
            System.out.println(a + " - " + b + " = " + calcResult);
        } else if (sign == '*') {
            calcResult = a * b;
            System.out.println(a + " * " + b + " = " + calcResult);
        } else if (sign == '/') {
            calcResult = a / b;
            System.out.println(a + " / " + b + " = " + calcResult);
        } else if (sign == '^') {
            int i = 2;
            calcResult = a;
            while (i <= b) {
                calcResult *= a;
                i++;
            }
            System.out.println(a + " ^ " + b + " = " + calcResult);
        } else if (sign == '%') {
            calcResult = a % b;
            System.out.println(a + " % " + b + " = " + calcResult);
        }
    }
}