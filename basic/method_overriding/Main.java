package basic.method_overriding;

public class Main {

    public static void main(String[] args) {

        /*
         * Method overriding = Declaring a method in sub class
         * which is already present in parent class.
         * done so that child class can give its own implementation         * 
         */

        Animal animal = new Animal();
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

    }
    
}
