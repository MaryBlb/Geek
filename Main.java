/* написать программу, которая загадывает случайное число от 0 до 9,
    пользователю дается 3 попытки;
    при каждой попытке мы сообщаем, больше или меньше введенное число, чем загаданное;
    после победы/проигрыша вводим запрос "повторить игру"? ответ: 1 - да, 2 - нет";
    */
package geekbrains.lesson3.homework;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task 1");
        int d = getNumberFromScanner("Угадай число 'd' от 0 до 9 в 3 попытки", 0, 9);
        Random rand = new Random();
        int x = rand.nextInt();
        System.out.println("d = " + d);
        int count = 0; int guess = -1; int number = random.nextInt(10);

    }
    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = scanner.nextInt();
        } while (x < min || x > max);
        return x;
    }
}