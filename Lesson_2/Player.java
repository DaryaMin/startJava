import java.util.Scanner;

public class Player {
    private String name;
    private int number;

    public Player() {
        Scanner console = new Scanner(System.in);

        System.out.println("Ведите имя игрока");
        this.name = console.next();
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }


}