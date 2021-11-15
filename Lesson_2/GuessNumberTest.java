import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Player playerOne = new Player();
        Player playerTwo = new Player();

        String repeat;

        System.out.println("Ведите имя первого игрока");
        String playerNameOne = console.next();
        System.out.println("Ведите имя второго игрока");
        String playerNameTwo = console.next();

        playerOne.setName(playerNameOne);
        playerTwo.setName(playerNameTwo);

        do {
            GuessNumber guess = new GuessNumber(playerOne, playerTwo);
            System.out.println(guess.getMisteryNumber());
            guess.play();

            repeat = "";
            while (!repeat.equals("yes") && !repeat.equals("no")) {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                repeat = console.next();
            }
        } while (repeat.equals("yes"));
    }
}