package ifelseoperators;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        //Например, если будет плохая погода - останемся дома, будем смотреть фильм.
        //Иначе если погода будет просто отличная - купим билеты и уедем в другой город на ярмарку.
        //Но если погода будет неопределенная, тогда встретимся с друзьями в нашем доме.


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pls what weather you have: (-1 = bad; 0 = undefined; 1 = good: ");
        int weather = sc.nextInt();
        sc.close();


        // версия кода №3
        if(weather == -1)
            System.out.println("останемся дома, смотрим фильм");

         else if (weather == 1)
            System.out.println("купим билеты и уедем в другой город на ярмарку");

         else if (weather == 0)
            System.out.println("встретимся с друзьями в нашем доме");

         else
            System.out.println("введенный параметр погоды некорректный!");     // защита от дурака

    }
}
