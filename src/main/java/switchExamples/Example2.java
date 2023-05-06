package switchExamples;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // вывести определение рабочий день или выходной

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls number day of week [1-7]: ");
        int day = sc.nextInt();

        sc.close();

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("working day");
                break;

            case 6, 7:
                System.out.println("weekend");
                break;

            default:
                System.out.println("Wrong number of day");
//                break;      // необязателен, если default стоит в последнем case

        }
    }

    // можем не использовать эти методы
    public static void printWorkingDay() {
        System.out.println("working day");
    }

    public static void printWeekend() {
        System.out.println("weekend");
    }
}
