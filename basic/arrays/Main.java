package basic.arrays;

public class Main {

    public static void main(String[] args) {
        // array = used to store multiple values in a single variable

        // first way to create array
        String[] cars = {"Toyota", "Honda", "Suzuki"};
        cars[0] = "BMW"; // will replace Toyota
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        // second way to create array
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Grape";

        for(int i = 0; i < fruits.length; i++ ) {
            System.out.println(fruits[i]);
        }

        // array int
        int[] scores = new int[3];
        scores[0] = 99;
        scores[1] = 78;
        scores[2] = 54;

        for(int i = 0; i < scores.length; i++ ) {
            System.out.println(scores[i]);
        }
    }
    
}
