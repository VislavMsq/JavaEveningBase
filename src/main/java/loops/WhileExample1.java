package loops;

import java.util.Scanner;

public class WhileExample1 {
    public static void main(String[] args) {



    }
    public static void example3(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Algorithm calculated final sum");
        System.out.print("Enter pls number: ");
        while (sc.hasNextInt()) {
            int value = sc.nextInt();
            System.out.println();
            sum += value;
            System.out.println("tmp sum = " + sum);
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }

    public static void example2() {
        int[] q = {4, 7, 1, 3, 9};

        int w = 0;      // счетчик куда записывается промежудточный результат
        while (w < q.length) {
            System.out.print(q[w] + " ");
            w++;
        }

        System.out.println();

        // напечатали массив в обратном порядке
        int e = q.length - 1;
        while (e >= 0) {
            System.out.print(q[e] + " ");
            e--;    // декремент, отнимает
        }

    }

    public static void example1() {
        int w = 0;
        while (w < 3) {
            System.out.println("hello, java " + w);
            w++;    // итерируем переменную, она доходит до 3 и цикл завершается
        }
    }


}
