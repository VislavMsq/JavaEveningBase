package switchExamples;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        // вывести определение рабочий день или выходной
        // более современный стиль switch-case
        // используем switch-case ак выражение, то есть мы можем приравнять к переменной

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls number day of week [1-7]: ");
        int day = sc.nextInt();
        sc.close();



        System.out.println(getDescription(day));
    }

    public static String getDescription(int day) {
        return switch (day) {
            case 1, 2, 3, 4, 5  -> "working day";
            case 6, 7           -> "weekend";
            default             -> "Wrong number of day";
        };
    }
}

