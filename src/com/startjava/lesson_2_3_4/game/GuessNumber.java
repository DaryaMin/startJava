package com.startjava.lesson_2_3_4.game;

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

    public void play() {
        Scanner console = new Scanner(System.in);

        do {
            System.out.println("Введите число игрок " + playerOne.getName());
            playerOne.setNumber(console.nextInt());

            if (tryGuess(playerOne)) {
                break;
            }

            System.out.println("Введите число игрок " + playerTwo.getName());
            playerTwo.setNumber(console.nextInt());

            if (tryGuess(playerTwo)) {
                break;
            }
        } while (true);
    }

    private boolean tryGuess(Player player) {
        boolean isGuess = false;
        if (player.getNumber() > misteryNumber) {
            System.out.println(player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < misteryNumber) {
            System.out.println(player.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю, игрок " + player.getName() + " угадал число!");
            isGuess = true;
        }
        return isGuess;
    }
}