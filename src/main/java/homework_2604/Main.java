package homework_2604;

public class Main {
    public static void main(String[] args) {
        // Напишите алгоритм, который бы увеличивал каждое значение массива на 10 и печатал бы его на экран.

        int[] q = new int[] {5,10,15,20,25,30,35,40,45,50};
        for (int i = 0; i < q.length; i++) {
            int res = q[i] + 10;
            System.out.println(q[i] + " - result array + 10 = " + res);
        }
    }
}
