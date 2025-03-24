package basic.abstraction;

public class Main {

    public static void main(String[] args) {

        /*
         * abstract = abstract classes cannot be instantiated, but they can have a subclass
         *            abstract method are declared without implementation
         */

        //  Vehicle vehicle = new Vehicle();

         Car car = new Car();
         car.go();
    }
    
}
