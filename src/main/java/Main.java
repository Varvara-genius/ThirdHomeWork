import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        firstTask();
        sc.nextLine();
        sc.close();
    }

    public static void firstTask() {

        int repeat = 1;
        do {
            System.out.println("Введите число от 0 до 9" + " у вас есть 3 попытки ");
            if (sc.hasNextInt()) {
                int number = r.nextInt(10);
                for (int i = 3; i > 0; i--) {
                    int inputNumber = sc.nextInt();
                    if (inputNumber > number) {
                        System.out.println("Загаданное число меньше ");
                    } else if (inputNumber < number) System.out.println("Загаданное число больше ");
                    if (inputNumber == number) {
                        System.out.println(" Вы угадали! ");
                        break;
                    }
                }
            }
            sc.nextLine();
            System.out.println(" Если вы хотите повторить игру нажмите 1 " + "если не хотите, " + "то нажмите 0 ");
        } while (repeat == sc.nextInt());
    }
}















