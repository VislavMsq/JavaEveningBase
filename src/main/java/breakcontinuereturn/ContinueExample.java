package breakcontinuereturn;

public class ContinueExample {
    public static void main(String[] args) {
        // indexes 0  1  2  3  4  5
        int[] q = {3, 4, 1, 6, 8, 7};

        for (int i = 0; i < q.length; i++) {

            System.out.print(q[i] + " ");

            if (q[i] % 2 == 1) {
                System.out.println();
                continue;
            }

            System.out.println("Чётное");

        }
    }
}
