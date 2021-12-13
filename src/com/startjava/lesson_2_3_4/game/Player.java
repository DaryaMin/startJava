package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int trying) {
        this.numbers[trying] = number;
    }

    public int[] getNumbers(int countTry) {
        return Arrays.copyOf(numbers, countTry);
    }

    public void clearNumbers(int countTry) {
        Arrays.fill(numbers, 0, countTry + 1, 0);
    }
}