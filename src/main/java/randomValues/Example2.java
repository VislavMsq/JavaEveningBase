package randomValues;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        // использование Random класса
        // диапозоны ] b [ - значения включая предел; ) и ( - значения не включая данный предел.
        // [4;7) => 4,5,6
        // (4;9] => 5,6,7,8,9

        Random random = new Random(800);

        double q = random.nextDouble();     //[0;1)
        double u = random.nextDouble();


        int w = random.nextInt();                      // [Integer.MIN; Integer.MAX]
        int e = random.nextInt(10);             // [0;10)
        int r = random.nextInt(4,7);      // [4;7)

        boolean t = random.nextBoolean();


        System.out.println(q);
        System.out.println(u);

    }
}
