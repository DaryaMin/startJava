import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner console = new Scanner(System.in);

        Player playerOne = new Player();
        Player playerTwo = new Player();

        String repeat;

        do {

            GuessNumber guess = new GuessNumber(random.nextInt(101));

            System.out.println("Введите число игрок " + playerOne.getName());
            playerOne.setNumber(console.nextInt());

            System.out.println("Введите число игрок " + playerTwo.getName());
            playerTwo.setNumber(console.nextInt());

            while (!guess.tryGuess(playerOne.getNumber()) && !guess.tryGuess(playerTwo.getNumber())) {
                System.out.println("Новая попытка");

                System.out.println("Введите число игрок " + playerOne.getName());
                playerOne.setNumber(console.nextInt());

                System.out.println("Введите число игрок " + playerTwo.getName());
                playerTwo.setNumber(console.nextInt());
            }


            if (guess.tryGuess(playerOne.getNumber())) {
                System.out.println("Игрок " + playerOne.getName() + " победил");
            } else if (guess.tryGuess(playerTwo.getNumber())) {
                System.out.println("Игрок " + playerTwo.getName() + " победил");
            }

            repeat = "";
            while ((!repeat.equals("yes")) && (!repeat.equals("no"))) {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                repeat = console.next();
            }
        } while (repeat.equals("yes"));
    }
}