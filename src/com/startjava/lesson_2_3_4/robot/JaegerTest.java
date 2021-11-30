package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger striker = new Jaeger("Striker Eureka");

        striker.setMark("Mark-5");
        striker.setOrigin("Australia");
        striker.setHeight(250f);
        striker.setWeight(1.85f);
        striker.setSpeed(10);
        striker.setArmor(9);

        Jaeger coyote = new Jaeger("Coyote Tango", "Mark-1", "Japan", 280f, 2.312f, 7, 4, 8);

        System.out.print("В наличии 2 Jaeger работа: ");
        System.out.println(striker.getModelName() +" и " + coyote.getModelName());
        
        System.out.println("Характеристики " + striker.getModelName() + ":");
        System.out.print("Модель: " + striker.getMark() + ", ");
        System.out.print("Проиводитель: " + striker.getOrigin() + ", ");
        System.out.print("Высота: " + striker.getHeight() + ", ");
        System.out.print("Вес: " + striker.getWeight() + ", ");
        System.out.print("Скорость: " + striker.getSpeed() + ", ");
        System.out.println("Вооружение: " + striker.getArmor() + ".");

        System.out.println("Характеристики " + coyote.getModelName() + ":");
        System.out.print("Модель: " + coyote.getMark() + ", ");
        System.out.print("Проиводитель: " + coyote.getOrigin() + ", ");
        System.out.print("Высота: " + coyote.getHeight() + ", ");
        System.out.print("Вес: " + coyote.getWeight() + ", ");
        System.out.print("Скорость: " + coyote.getSpeed() + ", ");
        System.out.println("Вооружение: " + coyote.getArmor() + ".");

        System.out.println("Проверка состояния " + striker.getModelName());
        System.out.println(striker.drift());
        striker.move();
        System.out.println(striker.scanKaiju());
        striker.useVortexCannon();

        System.out.println("Проверка состояния " + coyote.getModelName());
        System.out.println(coyote.drift());
        coyote.move();
        System.out.println(coyote.scanKaiju());
        coyote.useVortexCannon();

    }
}