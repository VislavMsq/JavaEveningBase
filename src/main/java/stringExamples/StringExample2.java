package stringExamples;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // строка длинее, чем 5 символа
        System.out.print("Enter pls test string object: ");
        String line = sc.nextLine();

        sc.close();

        // length() - длинна строки
        System.out.println("Length of string object is " + line.length());

        // charAt() - выбор символа исходя из позиуции элемента (индекса)
        System.out.println("Symbol = " + line.charAt(0));
        System.out.println("Symbol = " + line.charAt(3));

        // substring() - создание более кототкой строки на базе другой строки
        System.out.println("Substring = " + line.substring(1,4));
        System.out.println("Substring = " + line.substring(3));

        // toUpperCase() - возвращает все в верхний регистр
        System.out.println("toUpperCase = " + line.toUpperCase());

        // toLowerCase() - возвращает все в нижний регистр
        System.out.println("toLowerCase = " + line.toLowerCase());

        // contains() - проверка на вхождение
        System.out.println("contains (java) = " + line.contains("Java"));

    }
}
