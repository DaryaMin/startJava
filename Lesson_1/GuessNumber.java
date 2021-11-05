public class GuessNumber {
    public static void main(String[] args) {
        int misteryNumber = 84;
        int personNumber = 50;
        int endRange = 100;
        int startRange = 0;

        while (personNumber != misteryNumber) {
            System.out.println("Возможно загадано " + personNumber + "?");
            if (personNumber > misteryNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                endRange = personNumber;
                personNumber = personNumber - (personNumber - startRange) / 2;
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
                startRange = personNumber;
                personNumber = personNumber + (endRange - personNumber) / 2;
            }
        }
        System.out.println("Возможно загадано " + personNumber + "?");
        if (personNumber == misteryNumber) {
            System.out.println("Поздравляю, число угадано!");
        }
    }
}