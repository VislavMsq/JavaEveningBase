package loops;

public class LoopComparing {
    public static void main(String[] args) {
        int[] q = {4, 7, 1, 3, 9};

        // for loop  --- while loop
        //  |                    \
        // for-each loop       do-while loop

        // for loop
        System.out.print("For loop:      ");
        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();

        // for-each loop
        System.out.print("For-each:      ");
        for (int e : q)
            System.out.print(e + " ");
        System.out.println();

        // while loop
        System.out.print("While loop:    ");
        int w = 0;
        while (w < q.length ){
            System.out.print(q[w] + " ");
            w++;
        }
        System.out.println();

        // do-while loop
        System.out.print("Do-while loop: ");
        int j = 0;
        if (j < q.length) {
            do {
                System.out.print(q[j] + " ");
                j++;
            } while (j < q.length);
        }
        System.out.println();

    }
}
