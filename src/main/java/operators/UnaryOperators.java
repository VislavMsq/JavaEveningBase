package operators;

public class UnaryOperators {
    public static void main(String[] args) {
        example4();
    }
    public static void example1(){
        int q = 10;
        System.out.println(q); // 10

        // инкремент в префиксной форме
        ++q; // q = q + 1
        System.out.println(q); // 11

        // декримент в префиксной форме
        --q;
        System.out.println(q);
    }
    public static void example2(){
        int q = 10;
        System.out.println(q);
        System.out.println(++q);
        System.out.println(--q);
    }
    public static void example3(){
        int q = 10;
        System.out.println(q); // 10

        // инкремент в постфиксной форме
        q++; // q = q + 1
        System.out.println(q); // 11

        // декримент в постфиксной форме
        q--; // q = q - 1
        System.out.println(q); // 10
    }
    public static void example4(){
        int q = 10;
        System.out.println(q);      // 10
        System.out.println(q++);    // 10
        System.out.println(q--);    // 11
        System.out.println(q);      // 10
    }

    // ++q => 1. update; 2. работы с перменной
    // q++ => 1. работа с переменной; 2. update
}
