package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] number = new int[3];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int trying) {
        this.number[trying] = number;
    }

    public int[] getNumber() {
        return number;
    }
}