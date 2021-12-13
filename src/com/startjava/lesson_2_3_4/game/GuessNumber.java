package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int misteryNumber;
    private int maxTry = 10;
    private int tryNumber;

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        Random random = new Random();
        misteryNumber = random.nextInt(101);
    }

    public void play() {

        System.out.println("У каждого игрока по " + maxTry + " попыток");

        tryNumber = 0;

        for (tryNumber = 0; tryNumber < maxTry; tryNumber++) {
            inputNumber(playerOne, tryNumber);

            if (isGuess(playerOne)) {
                break;
            } else if (tryNumber == (maxTry - 1))
                System.out.println("У игрока " + playerOne.getName() + "закончились попытки");

            inputNumber(playerTwo, tryNumber);

            if (isGuess(playerTwo)) {
                break;
            } else if (tryNumber == (maxTry - 1))
                System.out.println("У игрока " + playerTwo.getName() + " закончились попытки");
        }
        printNumbers(playerOne);
        printNumbers(playerTwo);
        playerOne.clearNumbers(tryNumber);
        playerTwo.clearNumbers(tryNumber);
    }

    private void inputNumber(Player player, int tryNumber) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число игрок " + player.getName());
        player.setNumber(console.nextInt(), tryNumber);
    }

    private boolean isGuess(Player player) {
        int playerNumber = player.getNumbers(tryNumber + 1)[tryNumber];

        if (playerNumber != misteryNumber) {
            String guessAnswer = playerNumber > misteryNumber ? playerNumber + " больше того, что загадал компьютер" : playerNumber + " меньше того, что загадал компьютер";
            System.out.println(guessAnswer);
            return false;
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + playerNumber + " с " + (tryNumber + 1) + " попытки");
            return true;
        }
    }

    private void printNumbers(Player player) {
        for (int number : player.getNumbers(tryNumber + 1)) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}