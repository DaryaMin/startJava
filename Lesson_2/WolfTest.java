public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfTest = new Wolf();

        wolfTest.gender = "мужской";
        wolfTest.nick = "Дружок";
        wolfTest.age = 3;
        wolfTest.color = "серый";

        System.out.println("Пол " + wolfTest.gender);
        System.out.println("Кличка " + wolfTest.nick);
        System.out.println("Возраст " + wolfTest.age);
        System.out.println("Окрас " + wolfTest.color);

        wolfTest.go();
        wolfTest.run();
        wolfTest.seat();
        wolfTest.howl();
        wolfTest.hunt();
    }
}