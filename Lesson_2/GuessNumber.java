import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int misteryNumber;
    private int endRange = 100;
    private int startRange = 0;

    Player playerOne;
    Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        Random random = new Random();
        misteryNumber = random.nextInt(101);
    }

    public int getMisteryNumber() {
        return misteryNumber;
    }

    public void play() {
        Random random = new Random();
        Scanner console = new Scanner(System.in);

        System.out.println("Введите число игрок " + playerOne.getName());
        playerOne.setNumber(console.nextInt());

        System.out.println("Введите число игрок " + playerTwo.getName());
        playerTwo.setNumber(console.nextInt());

        while (!tryGuess(playerOne.getNumber()) && !tryGuess(playerTwo.getNumber())) {
            System.out.println("Новая попытка");

            System.out.println("Введите число игрок " + playerOne.getName());
            playerOne.setNumber(console.nextInt());

            System.out.println("Введите число игрок " + playerTwo.getName());
            playerTwo.setNumber(console.nextInt());
        }
        if (tryGuess(playerOne.getNumber())) {
            System.out.println(playerOne.getName() + " победил");
        } else if (tryGuess(playerTwo.getNumber())) {
            System.out.println(playerTwo.getName() + " победил");
        }
    }

    public boolean tryGuess(int number) {
        boolean isGuess = false;
        if (number > misteryNumber) {
            System.out.println(number + " больше того, что загадал компьютер");
        } else if (number < misteryNumber) {
            System.out.println(number + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю, число угадано!");
            isGuess = true;
        }
    return isGuess;
    }
}