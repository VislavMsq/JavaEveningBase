package loops;

public class DoWhileExample1 {
    public static void main(String[] args) {

        int[] q = {4, 7, 1, 3, 9};

        int w = 0;
        do {
            System.out.print(q[w] + " ");
            w++;
        }while ( w < q.length);


        int e = q.length -1;
        do {
            System.out.print(q[e] + " ");
            e--;
        } while (e >= 0);


    }

    public static void example1() {
        int q = 0;
        do {
            System.out.println("hello, java " + q);
            q++;
        } while (q < 3); // выполнится хотя бы один раз, если так q < -1
    }

}
