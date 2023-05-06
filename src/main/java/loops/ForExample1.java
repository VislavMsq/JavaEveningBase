package loops;

public class ForExample1 {
    public static void main(String[] args) {

        // index   0  1  2  3  4  5  6
        int[] q = {4, 3, 1, 7, 8, 4, 0};

        for (int i = 0; i < q.length; i++)
            System.out.print(q[i] + " ");

        System.out.println();

        // метод foreach - цикл рабоатет только со всем массивом от начала и до конца
        for (int element : q)
            System.out.print(element);

        // цикл будет идти до границ значения инта, когда выйдет в экстремальную часть, он закончится
        for (int i = 1; i >= 1; i+= 10000) { // установили шаг итерации в 10к
            System.out.println("infinite loop " + i);
        }

        // бесконечный цикл без условия
        for (;;){
            System.out.println("hello");
        }




    }

    public static void example1() {
        // самый простой пример цикла for
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello Java" + i);
        }
    }

    public static void example2() {
        // можно вынести инициализацию переменной выше цикла for
        int i = 0;

        for (; i < 3; i++) {
            System.out.println("Hello Java " + i);
        }
        System.out.println(i);
    }

    public static void example3() {
        // пример изменения стартовой переменной с шагом отличным от единицы
        for (int i = 0; i < 10; i += 2) { // i += 2 <=> i = i + 2
            // запустили только четные элементы ( если 0 заменим на 1, то выведем нечетные)
            System.out.println("Hello Java " + i);
        }
    }

    public static void example4() {
        // вывести все элементы массива в прямом и обратном направлении
        // index   0  1  2  3  4  5  6
        int[] q = {4, 3, 1, 7, 8, 4, 0};

        for (int i = 0; i < q.length; i++) { // i += 2 <=> i = i + 2
            System.out.print(q[i] + " ");
        }

        System.out.println();

        // ысчитали нашу длинну и отняли 1 элемент, чтобы вывести весь массив
        for (int i = q.length - 1; i >= 0; i--) {
            System.out.print(q[i] + " ");
        }
    }

    public static void example5() {
        // бесконечный цикл, идет в рамках диапазона
        for (byte i = 125; i < 130; i++) {
            System.out.println("Hello Java " + i);

        }
    }
    public static void example6(){
        // выводится в консоль 11 значений вместо 10, так работает число с плавающей точкой
        for (double i = 0; i < 1; i += 0.1) {
            System.out.println("Hello Java " + i);
        }
    }
    public static void example7(){
        // не работает с инвексами массива
        // метод foreach - цикл рабоатет только со всем массивом от начала и до конца

//        for (int element : q)
//            System.out.print(element + " ");


    }
}
