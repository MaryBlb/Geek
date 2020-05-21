/* написать программу, которая загадывает случайное число от 0 до 9,
    пользователю дается 3 попытки;
    при каждой попытке мы сообщаем, больше или меньше введенное число, чем загаданное;
    после победы/проигрыша вводим запрос "повторить игру"? ответ: 1 - да, 2 - нет";
    */
package geekbrains.lesson3.homework;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int count = 0;
            int guess = -1;
            int number = random.nextInt(10);
            while (count < 3 && guess != number) {
                System.out.println("Guess the num from 0 to 9 in 3 attempts");
                guess = scanner.nextInt();
                if (number != guess) {
                    System.out.println("The entered num is " + ((guess > number) ? "higher" : "less"));
                    count++;
                }
            }
            System.out.println("The num is " + ((guess == number) ? "right" : "wrong"));
            System.out.println("Would u like 2 repeat the game? 'Yep' - 1, 'Nope' - 2");
        } while (scanner.nextInt() == 1);
    }
}


