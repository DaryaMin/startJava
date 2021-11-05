public class Cycle {
    public static void main(String[] args) {
        System.out.println("Выводим на консоль с помощью цикла for все числа от [0, 20]");
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }

        System.out.println("Выводим на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)");
        int i = 6;
        while (i > -7) {
            System.out.println(i);
            i -= 2;
        }

        System.out.println("Выводим на консоль сумму нечетных чисел от [10, 20] подсчитанную с помощью цикла do-while");
        i = 10;
        int sumOdd = 0;
        do {
            if (i % 2 != 0) {
                sumOdd += i;
                System.out.print(i + " + ");
            }
            i++;
        } while (i <= 20);
        System.out.print("=" + sumOdd);
    }
}