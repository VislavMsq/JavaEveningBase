package castingVeriables;

public class castingVarExample1 {
    public static void main(String[] args) {

        // переменные целых чисел
        byte w = 10;
        short e = 114;
        int r = 156_000;
        long t = 3_000_000_000L;

        // переменные чисел с плавающей точкой
        float y = 3.14F;
        double u = 2.71;

        // автоматическое преобразование Типов (расширение)
        // Byte -> Short -> Int -> Long -> Float -> Double
        long i = t;
        System.out.println(i);

        // явное преобразование Типов (сужение)
        // Byte -> Short -> Int -> Long -> Float -> Double
        double p = 3.141592653589793;
        int a = (int) p;

        System.out.println(p);
        System.out.println(a);

        int s = (int) t;
        System.out.println(s);

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println( (byte)(Byte.MAX_VALUE + 1));

        System.out.println((int)Math.pow(10,2));


    }
}
