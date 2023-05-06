package randomValues;

public class Example1 {
    public static void main(String[] args) {
        // использование Math.random()

        double q = Math.random();   // [0.0; 1.0)

        // [0; 1) * 10 => [0; 10)
        // [0; 10) - целевой желаемый диапозон
        double w = Math.random() * 10; // [0; 10)

        // [0; 1) * 3 => [0; 3) + => [4; 7)
        // [4; 7) - целевой желаемый диапозон
        double e = 4 + Math.random() * 3;

        // [min; max)
        // min + Math.random() * (max - mix)

        System.out.println(e);
    }
}
