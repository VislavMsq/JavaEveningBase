package castingVeriables;

public class CharExamples {
    public static void main(String[] args) {
        // ' " `

        char q = 'a';
        System.out.println(q);
        System.out.println((int) q + "\n");

        char w = 231;
        System.out.println(w);
        System.out.println((int) w );
        System.out.println((char) w + "\n");

        char e = '\u03B2';
        System.out.println(e);
        System.out.println((int) e + "\n");

        //базовая арифметика над типом char
        System.out.println(q / q);
        System.out.println(q * q);
        System.out.println(q + q);
        System.out.println(q - q);
        System.out.println(q % q);


    }
}
