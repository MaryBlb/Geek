package geekbrains.lesson1.ht;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
// 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
    }

// 2. Переменные всех пройденных типов данных, и инициализировать их значения
    public static void main(String[] args) {
        byte a = 100; //-128 < a < 127
        short b = 10500; // -32768 < b < 32767
        int c = 10005000; // -2147483648 < c < 2147483647
        long d = 1050505000040L; // -9223372036854775808L < d < 9223372036854775807L
        float e = 3.0f; // 32 (1.4e-45f < e < 3.4e+38f)
        double f = 5.0; // 64 (от 4.9e-324 до 1.7e+308)
        char g = 5;
        char h = (char) ((a + c) / 2);
        String hell0 = "привет";
    }

 // 3.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = 2; b = 10; c = 20; d = 5;
        e = a * (b + (c / d));
        System.out.println(e);
    }
// 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи первое число");
        int a = scanner.nextInt();
        System.out.println("Введи второе число");
        int b = scanner.nextInt();
        System.out.println(check(a, b));
    }

    public static boolean check (int a, int b) {
        return ( (a + b) >= 10 && (a + b) <= 20);
    }

// 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void main(String[] args) {
    System.out.println("Введи число");
    int a = scanner.nextInt();
    isPositiveOrNegative(a);
    }

    public static void isPositiveOrNegative(int a) {
        if(a >= 0)
        {
            System.out.println(a + " положительное число");
        } else {
            System.out.println(a + " отрицательное число");
        }

// 6. Метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи число");
            int a = scanner.nextInt();
            System.out.println(isNegative(a));
        }

        public static boolean isNegative(int a)
        {
            return a < 0;
        }
}
