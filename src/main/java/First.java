import com.auto.germany.Car;

import java.util.jar.JarOutputStream;

public class First {

    // main - создание стартовой точки
    // sout - комманда для печати в консоль
    // CTRL + d - создание копии строки
    // "\"" - пример для вывода в консоль "
    // CTRL + b - переход к документации
    // CTRL + f4 - закрытие вкладки


    public static void main(String[] args) {

        // создание экземпляра №1
        Car germanCar = new Car();

        System.out.println(germanCar.model);
        System.out.println(germanCar.power);
        System.out.println(germanCar.year);
        germanCar.printCar();

        System.out.println("static: " + Car.birthYear);

        // выше год отработал, к нижнему методу применяем новый год
        Car.birthYear = 2000;

        System.out.println();

        // создание экземпляра №2
        Car anotherGermanCar = new Car();

        // изменяли поля экземпляра №2
        anotherGermanCar.model = "BMW";
        anotherGermanCar.power = 190;
        anotherGermanCar.year = 2021;

        // печать полей
        System.out.println(anotherGermanCar.model);
        System.out.println(anotherGermanCar.power);
        System.out.println(anotherGermanCar.year);
        anotherGermanCar.printCar();

        System.out.println("static: " + Car.birthYear);

    }
}
