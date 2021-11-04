public class GuessNumber{
    public static void main(String[] args) {
        int misteryNumber = 84;
        int trialNumber = 37;
        int maxNumber = 100;
        int minNumber = 0;

        while (trialNumber != misteryNumber) {
            System.out.println("Возможно загадано " + trialNumber + "?");
            if (trialNumber > misteryNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                maxNumber = trialNumber;
                trialNumber = trialNumber - (trialNumber - minNumber) / 2;
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
                minNumber = trialNumber;
                trialNumber = trialNumber + (maxNumber - trialNumber) / 2;
            }
        }
        System.out.println("Возможно загадано " + trialNumber + "?");
        if (trialNumber == misteryNumber) {
            System.out.println("Поздравляю, число угадано!");
        } else {
            System.out.println("Что-то пошло не так");
        }
    }
}