import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
            return;
        } else {
            System.out.println(year + " год не является високосным.");
            return;
        }
    }

    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задача №1");
        System.out.println("Введите год");
        int year = scan.nextInt();

        checkYear(year);
    }

    public static void getVersion (int OS, int year) {
        if (OS != 1 || OS != 0) {
            System.out.println("Введите корректные данные.");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        if (OS == 1 && year != currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (OS == 1 && year == currentYear) {
            System.out.println("Установите  версию приложения для Android по ссылке.");
        } else if (OS == 0 && year != currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите  версию приложения для iOS по ссылке.");
        }
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nЗадача №2");
        System.out.println("Укажите вашу ОС. 0 - iOs. 1  - android.");
        int OS = scan.nextInt();
        System.out.println("Введите год производства вашего телефона.");
        int year = scan.nextInt();

        getVersion(OS, year);
    }

    public static int deliveryDistance  (int deliveryDistance) {
        int deliveryNearlyMax = 20;
        int deliveryNearlyDay = 1;
        int deliveryAverageMax = 60;
        int deliveryAverageDay = 2;
        int deliveryFarMax = 100;
        int deliveryFarDay = 3;

        if (deliveryDistance < deliveryNearlyMax) {
            return 1;
        }
        else if (deliveryDistance >= deliveryNearlyMax && deliveryDistance < deliveryAverageMax) {
            return 2;
        }
        else if (deliveryDistance <= deliveryFarMax) {
            return 3;

        }
        else {
            return 0;
        }
    }

    public static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nЗадача №3");
        System.out.println("Введите расстояние от офиса до вашего дома.");
        int distance = scan.nextInt();

        int days = deliveryDistance(distance);
        if (days != 0) {
            System.out.println("Потребуется дней: " + days + ".");
        } else {
            System.out.println("Доставка не производится.");
        }
    }
}