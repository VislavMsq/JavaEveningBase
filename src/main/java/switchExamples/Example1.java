package switchExamples;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

// вывести название дня недели исходя из его порядкового номера в неделе
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls number day of week [1-7]: ");
        int day = sc.nextInt();
        sc.close();

        switch (day) {
            case 1:
                System.out.println("MO");
                break;

            case 2:
                System.out.println("TU");
                break;

            case 3:
                System.out.println("WE");
                break;

            case 4:
                System.out.println("TH");
                break;

            case 5:
                System.out.println("FR");
                break;

            case 6:
                System.out.println("SA");
                break;

            case 7:
                System.out.println("SU");
                break;

            default:
                System.out.println("Wrong number of day");
                // break;      // необязателен, если default стоит в последнем case




        }
    }
}
