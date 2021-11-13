public class GuessNumber {
    private int misteryNumber;
    private int endRange = 100;
    private int startRange = 0;

    public GuessNumber(int misteryNumber) {
        this.misteryNumber = misteryNumber;
    }

    public int getMisteryNumber() {
        return misteryNumber;
    }

    public boolean tryGuess(int personNumber) {
        boolean isGuess = false;
        if (personNumber > misteryNumber) {
            System.out.println(personNumber + " больше того, что загадал компьютер");
        } else if (personNumber < misteryNumber) {
            System.out.println(personNumber + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю, число угадано!");
            isGuess = true;
        }
    return isGuess;
    }
}