public class Variable {
    public static void main(String[] args) {
        byte cpuCount = 4;
        short memory = 250;
        int ram = 2000;
        long videocardNumber = 3650;
        float processorFrequency = 2.1f;
        double weight = 3.4d;
        char usbType = 'A';
        boolean isLaptop = true;

        System.out.println("Конфигурация компьютера:");
        System.out.println("Является компьютер ноутбуком: " + isLaptop);
        System.out.println("Процессор " + cpuCount + "*" + processorFrequency + " ГГЦ");
        System.out.println("Память: RAM " + ram + " , HDD " + memory +" ГБ");
        System.out.println("Видеокарта " + videocardNumber);
        System.out.println("Тип разъема USB Type " + usbType);
        System.out.println("Вес " + weight);
    }
}