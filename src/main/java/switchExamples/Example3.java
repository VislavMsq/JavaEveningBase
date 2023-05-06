package switchExamples;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        // вывести определение рабочий день или выходной
        // более современный стиль switch-case

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls number day of week [1-7]: ");
        int day = sc.nextInt();
        sc.close();

        switch (day) {
            case 1, 2, 3, 4, 5  -> System.out.println("working day");
            case 6, 7           -> System.out.println("weekend");
            default             -> System.out.println("Wrong number of day");
        }
    }
}
