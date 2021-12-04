package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int misteryNumber;
    private int maxTry;
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
        maxTry = playerOne.getNumber().length;
        System.out.println("У каждого игрока по " + maxTry + " попыток");

        Scanner console = new Scanner(System.in);

        tryNumber = 0;

        for (tryNumber = 0; tryNumber < maxTry; tryNumber++) {
            System.out.println("Введите число игрок " + playerOne.getName());
            playerOne.setNumber(console.nextInt(), tryNumber);

            if (tryGuess(playerOne)) {
                break;
            } else if (tryNumber == (maxTry - 1)) System.out.println("У игрока " + playerOne.getName() + "закончились попытки");

            System.out.println("Введите число игрок " + playerTwo.getName());
            playerTwo.setNumber(console.nextInt(), tryNumber);

            if (tryGuess(playerTwo)) {
                break;
            }else if (tryNumber == (maxTry - 1)) System.out.println("У игрока " + playerTwo.getName() + " закончились попытки");

        }
        printAllNumber();
        cleanNumber();
    }

    private boolean tryGuess(Player player) {
        boolean isGuess = false;
        int playerNumber = player.getNumber()[tryNumber];
        if (playerNumber > misteryNumber) {
            System.out.println(playerNumber + " больше того, что загадал компьютер");
        } else if (playerNumber < misteryNumber) {
            System.out.println(playerNumber + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + playerNumber + " с " + tryNumber + " попытки");
            isGuess = true;
        }
        return isGuess;
    }

    private void printAllNumber(){
        for (int i = 0; i <= tryNumber; i++) {
            System.out.print(playerOne.getNumber()[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= tryNumber; i++) {
            System.out.print(playerTwo.getNumber()[i] + " ");
        }
        System.out.println();
    }

    private void cleanNumber() {
        Arrays.fill(playerOne.getNumber(), 0, tryNumber + 1, 0);
        Arrays.fill(playerTwo.getNumber(), 0, tryNumber + 1, 0);
    }
}