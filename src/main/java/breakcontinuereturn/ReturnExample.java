package breakcontinuereturn;

public class ReturnExample {
    public static void main(String[] args) {
        // indexes 0  1  2  3  4  5
        int[] q = {3, 4, 1, 6, 8, 7};


        for (int i = 0; i < q.length; i++) {
            if (q[i] == 8) {
                return;
            }
            System.out.println(q[i]);
        }
        System.out.println("end of file");
    }

}
