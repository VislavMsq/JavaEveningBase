package operators;

public class RelationOperators {
    public static void main(String[] args) {
        int q = 10;
        int w = 20;

        boolean qLessW = (q < w);

        System.out.println("q < w = " + (q < w));
        System.out.println("q > w = " + (q > w));
        System.out.println("q <= w = " + (q <= w));
        System.out.println("q >= w = " + (q >= w));
        System.out.println("q == w = " + (q == w));     // знак равно
        System.out.println("q != w = " + (q != w));     // не ровняется - знак !
    }
}
