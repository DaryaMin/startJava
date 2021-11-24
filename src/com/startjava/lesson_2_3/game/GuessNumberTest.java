package src.com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Ведите имя первого игрока");
        Player playerOne = new Player(console.next());

        System.out.println("Ведите имя второго игрока");
        Player playerTwo = new Player(console.next());

        String repeat;

        do {
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.play();

            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                repeat = console.next();
            } while (!repeat.equals("yes") && !repeat.equals("no"));
        } while (repeat.equals("yes"));
    }
}