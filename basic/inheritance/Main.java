package basic.inheritance;

public class Main {

    public static void main(String[] args) {

        // inherintance = the process where one class acquires,
        //                the atrributes and methods of another.

        Car car = new Car();
        car.go();
        car.stopped();

        Bicycle bicycle = new Bicycle();
        bicycle.go();

        System.out.println(car.speed);
        System.out.println(bicycle.speed);

        System.out.println(car.doors);
        System.out.println(car.wheels);

        System.out.println(bicycle.pedals);
        System.out.println(bicycle.wheels);

    }
    
}
