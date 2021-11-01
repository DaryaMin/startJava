public class ConditionalStatement {
    public static void main(String[] args) {
        byte age = 30;
        if(age > 20) {
            System.out.println("Возраст более 20 лет");
        }

        boolean isMale = false;
        if(!isMale) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }

        float height = 1.7f;
        if(height < 1.80) {
            System.out.println("Рост меньше 180 см");
        } else {
            System.out.println("Рост более или равен 180 см");
        }

        char firstLetterInName = 'D';
        if(firstLetterInName == 'M') {
            System.out.println("Имя начинается на букву M");
        } else if (firstLetterInName == 'I') {
            System.out.println("Имя начинается на букву I");
        } else {
            System.out.println("Имя начинается на отличную от M и I букву");
        }
    }
}