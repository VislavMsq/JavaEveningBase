package ifelseoperators;

public class Example4 {
    public static void main(String[] args) {
        //Например, если будет плохая погода - останемся дома, будем смотреть фильм.
        //Иначе если погода будет просто отличная - купим билеты и уедем в другой город на ярмарку.
        //Но если погода будет неопределенная, тогда встретимся с друзьями в нашем доме.

        String weather = "bad";    // good / bad / undefined

        // версия кода №1
//        if (weather.equals("bad")) {  // equals - сравниваем значение String
//            System.out.println("останемся дома, смотрим фильм");
//        } else {
//            if (weather.equals("good")) {
//                System.out.println("купим билеты и уедем в другой город на ярмарку");
//            } else {
//                if (weather.equals("undefined")) {
//                    System.out.println("встретимся с друзьями в нашем доме");
//                } else {
//                    System.out.println("введенный параметр погоды некорректный!");  // проверка на ввод
//                }
//            }
//
//        }

        // версия кода №2
//        if (weather.equals("bad"))   // equals - сравниваем значение String
//            System.out.println("останемся дома, смотрим фильм");
//         else {
//            if (weather.equals("good"))
//                System.out.println("купим билеты и уедем в другой город на ярмарку");
//             else {
//                if (weather.equals("undefined")) {
//                    System.out.println("встретимся с друзьями в нашем доме");
//                } else {
//                    System.out.println("введенный параметр погоды некорректный!");  // проверка на ввод
//                }
//            }
//
//        }

        // версия кода №3
        if(weather.equals("bad")){
            System.out.println("останемся дома, смотрим фильм");
        } else if (weather.equals("good")) {
            System.out.println("купим билеты и уедем в другой город на ярмарку");
        } else if (weather.equals("undefined")){
            System.out.println("встретимся с друзьями в нашем доме");
        } else {
            System.out.println("введенный параметр погоды некорректный!");     // защита от дурака
        }

    }
}
