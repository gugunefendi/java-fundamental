package basic.copy_object;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Avanza", 2010);
        Car car2 = new Car("Honda", "Jazz", 2015);

        // DONT USE THIS FOR COPY OBJECT!
        // it will be copy object and address memory
        // car2 = car1; 

        // USE THIS
        // ceate method for copy the object
        car2.copyObject(car1); // firs way call method directly

        Car car3 = new Car(car1); // second way use overload constructor

        System.out.println("Memeory address car1: " + car1); //print memory address from car1
        System.out.println("Memeory address car2: " + car2); //print memory address from car2
        System.out.println("Memeory address car3: " + car3); //print memory address from car2
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());

    }
    
}
