package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfTest = new Wolf();

        wolfTest.setGender("мужской");
        wolfTest.setNick("Дружок");
        wolfTest.setAge(9);
        wolfTest.setColor("серый");

        System.out.println("Пол " + wolfTest.getGender());
        System.out.println("Кличка " + wolfTest.getNick());
        System.out.println("Возраст " + wolfTest.getAge());
        System.out.println("Окрас " + wolfTest.getColor());

        wolfTest.go();
        wolfTest.run();
        wolfTest.seat();
        wolfTest.howl();
        wolfTest.hunt();
    }
}