package numberSystems;

public class BinaryExamples {
    public static void main(String[] args) {
        int q = 296;

        // перевод из 10 -> 2 (classic way)
        System.out.println(296 / 2);    // 198
        System.out.println(296 % 2);           // 0

        System.out.println(198 / 2);    // 74
        System.out.println(198 % 2);           // 0

        System.out.println(74 / 2);    // 37
        System.out.println(74 % 2);            // 0

        System.out.println(37 / 2);    // 18
        System.out.println(37 % 2);            // 1

        System.out.println(18 / 2);    // 9
        System.out.println(18 % 2);            // 0

        System.out.println(9 / 2);    // 4
        System.out.println(9 % 2);             // 1

        System.out.println(4 / 2);    // 2
        System.out.println(4 % 2);             // 0

        System.out.println(2 / 2);    // 1
        System.out.println(2 % 2);             // 0

        System.out.println(1 / 2);    // 0  <- встречаем 0 и останавливаемся
        System.out.println(1 % 2);             // 1

        // результат - 100101000 - бинарное представление числа 296

        // перевод числа из 10-й -> 2-ю (short way)
        System.out.println("short way 10 -> 2 = " + Integer.toBinaryString(q));

        // перевод числа из 2-й -> 10-ю (classic way)
        System.out.println(1*Math.pow(2,8) + 0*Math.pow(2,7) + 0*Math.pow(2,6) + 1*Math.pow(2,5) + 0*Math.pow(2,4) + 1*Math.pow(2,3) + 0*Math.pow(2,2) + 0*Math.pow(2,1) + 0*Math.pow(2,0));
        System.out.println(1*Math.pow(2,8) + 1*Math.pow(2,5) + 1*Math.pow(2,3));

        // перевод числа из 2-й -> 10-ю (short way)
        int q2 = 0b100101000;
        System.out.println(q2);


        // 1 байт = 8 бит
        // 00000000 - min value of byte = 0 в десятичной форме
        // 11111111 - max value of byte = 255 в десятичной форме

        // 00000000 00000000 00000000 - 0
        // 11111111 11111111 11111111 - 4294967295
    }
}
