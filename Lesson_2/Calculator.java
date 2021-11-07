public class Calculator {

    int a;
    int b;
    char sign;
    int calcResult;

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
                System.out.println(a + " + " + b + " = " + calcResult);
                break;
            case ('-') :
                calcResult = a - b;
                System.out.println(a + " - " + b + " = " + calcResult);
                break;
            case ('*') :
                calcResult = a * b;
                System.out.println(a + " * " + b + " = " + calcResult);
                break;
            case ('/') :
                calcResult = a / b;
                System.out.println(a + " / " + b + " = " + calcResult);
                break;
            case ('^') :
                int i = 2;
                calcResult = a;
                while (i <= b) {
                    calcResult *= a;
                    i++;
                }
                System.out.println(a + " ^ " + b + " = " + calcResult);
                break;
            case ('%') :
                calcResult = a % b;
                System.out.println(a + " % " + b + " = " + calcResult);
                break;
        }
    }
}