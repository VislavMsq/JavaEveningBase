package castingVeriables;

public class CharExamples2 {
    public static void main(String[] args) {
        // primitivo    Class(Reference)
        // boolean      Boolean
        // byte         Bite
        // short        Short
        // int          Integer (!)
        // long         Long
        // float        Float
        // double       Double
        // char         Character (!)


        // способ 1
        char w = 'a';
        int w1 = (int) w;
        System.out.println((int) w);

        // способ 2
        char e = '9';
        int e2 = Integer.parseInt(String.valueOf(e));
        System.out.println(e2);
        System.out.println(e2 + 1);

        // способ 3
        char r = '8';
        int r3 = Character.getNumericValue(r);
        System.out.println(r3);
        System.out.println(r3 / 2);



    }
}
