import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int misteryNumber;
    private int endRange = 100;
    private int startRange = 0;

    private Player playerOne;
    private Player playerTwo;

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

        boolean isPlayerOneGuess = false;
        boolean isPlayerTwoGuess = false;

        do {
            System.out.println("Введите число игрок " + playerOne.getName());
            playerOne.setNumber(console.nextInt());
            isPlayerOneGuess = tryGuess(playerOne.getNumber());

            if (isPlayerOneGuess) {
                System.out.println(playerOne.getName() + " победил");
                break;
            }

            System.out.println("Введите число игрок " + playerTwo.getName());
            playerTwo.setNumber(console.nextInt());
            isPlayerTwoGuess = tryGuess(playerTwo.getNumber());

            if (isPlayerTwoGuess) {
                System.out.println(playerTwo.getName() + " победил");
                break;
            }
        } while (!isPlayerOneGuess && !isPlayerTwoGuess);
    }

    private boolean tryGuess(int number) {
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