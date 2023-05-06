import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter please number of day in month: ");
        int day = sc.nextInt();
        System.out.println("You've entered - " + day);

        System.out.print("Enter pls number of month in year: ");
        short month = sc.nextShort();
        System.out.println("You're entered " + month);

        System.out.print("Enter pls your weather temperature outside (double) : ");
        double t = sc.nextDouble();
        System.out.println("Your temperature is " + t);




        sc.close();     // закрываем наш сканер

    }
}
