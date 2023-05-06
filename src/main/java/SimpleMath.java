public class SimpleMath {
    public static void main(String[] args) {
        // ПРИМИТИВЫ
        // логическая переменная (имеется бинаризация: true/false)
        boolean q = true;

        // переменные целых чисел
        byte w = 10;
        short e = 114;
        int r = 156_000;
        long t = 3_000_000_000L;

        // переменные чисел с плавающей точкой
        float y = 3.14F;
        double u = 2.71;

        // символьная переменная
        char i = 'g';

        // примитив ------- класс обвертка
        // boolean          Boolean
        // byte             Byte
        // short            Short
        // int              Integer     (!)
        // long             Long
        // float            Float
        // double           Double
        // char             Character   (!)

        // simple math operations (+, -, *, /)
        System.out.println(u / 2);

        // деление с остатком(%)
        System.out.println(3 % 2);


    }
}
