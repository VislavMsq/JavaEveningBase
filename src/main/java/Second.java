import com.auto.finland.Car;

public class Second {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 130, 2021);
        car1.print();

        Car car2 = new Car("Audi", 210);
        car2.print();

        Car car3 = new Car("Mercedes");
        car3.print();

        Car car4 = new Car();
        car4.print();
    }
}
