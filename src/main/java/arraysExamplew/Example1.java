package arraysExamplew;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        int[] q = new int[]{4, 2, 3, 7, 5, 8, 1, 6};

        int[] w = Arrays.copyOf(q, 5);  //q - обращаемся к массиву, 5 - это новая длинна массива
        int[] e = Arrays.copyOf(q, 10);

        System.out.println("original =  " + Arrays.toString(q) + " " + q);
        System.out.println("copyOf(5) =  " + Arrays.toString(w) + " " + w);
        System.out.println("copyOf(10) =  " + Arrays.toString(e) + " " + e);

        int[] r = Arrays.copyOfRange(q,3,6);    // метод копирования массива нужного размера
        int[] t = Arrays.copyOfRange(q,3,30);   // q - массив, 3 - позиция, 30 - размер массива
        System.out.println("original =  " + Arrays.toString(q) + " " + q);
        System.out.println("copyOfRange(3,6) =  " + Arrays.toString(r) + " " + r);
        System.out.println("copyOfRange(3,30) =  " + Arrays.toString(t) + " " + t);




        // Сортировка по возростанию
        System.out.println(Arrays.toString(q)); //выводим наш массив на консоль
        Arrays.sort(q); // метод для сортировки массива
        System.out.println(Arrays.toString(q));
    }

    public static void example4() {
        // создание массива обьектов
        Student[] team = new Student[]{
                new Student("Bob", 20),
                new Student("Anna", 21)
        };

        System.out.println(Arrays.toString(team));


        for (int i = 0; i < team.length; i++) {
            Student tmp = team[i];      //создали переменную, чтобы код выполнялся один раз
            System.out.println("Student: name= " + tmp.getName() + "; age= " + tmp.getAge());
        }
        System.out.println("---------------------------");

        for (Student element : team)
            System.out.println("Student: name= " + element.getName() + "; age= " + element.getAge());

    }

//        short[] q = new short[100];
//
//        for (int i = 0; i < q.length; i++) {
//            q[i] = (short) i;
//        }
//
//        // класс, чтобы напечатаьь данные из массива
//        System.out.println(Arrays.toString(q));


    public static void example2() {
        // создание пустых массивов

        // численные массива
        int[] q = new int[3];
        for (int i = 0; i < q.length; i++)
            System.out.println(q[i]);

        // логическае массивы
        boolean[] w = new boolean[4];
        for (boolean e : w)
            System.out.println(e);

        // массивы обьектов
        String[] e = new String[2];
        for (String element : e)
            System.out.println(element);
    }

    public static void example1() {
        // создание массива различными способами

        // 1. (деклорация + аллокация = инициализация)
        int[] q;            // деклорация
        q = new int[3];     // аллокация

        // 2.
        byte[] w = new byte[10];

        // 3.
        short[] e = {1, 2, 3, 0, 9, 8};

        // 4.
        double[] r = new double[]{0.5, 1.5, 2.5, 2.7, 3.2};

        // Java wey vs C way
        int[] t = new int[3];   // java stylex
        int y[] = new int[3];   // C style
    }
}
