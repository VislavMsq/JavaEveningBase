import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pls width: ");
        double w = sc.nextDouble();

        System.out.print("Enter pls height: ");
        double h = sc.nextDouble();

        System.out.print("Enter pls depth: ");
        double d = sc.nextDouble();

        double volume = w * h * d;
        System.out.println("The box volume is " + volume);


        sc.close();
    }
}
