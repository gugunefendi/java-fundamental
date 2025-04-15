package qq_array;

public class Main {

    public static void main(String[] args) {
        // Array

        // Syntax membuat array
        // tipe data[] = {value array}
        
        // array string
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // array int
        int[] numbers = {100, 200, 300, 400};

        // mengakses array
        String firstCar = cars[0];
        int firstNumber = numbers[0];

        System.out.println(firstCar);
        System.out.println(firstNumber);

        // mengubah element array
        cars[0] = "Opel";
        String changeValueArray = cars[0];

        System.out.println(changeValueArray);

        // mencetak panjang array
        System.out.println(cars.length);


        // looping array
        // looping menggunakan for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // loping menggunakan foreach
        for (String elemen : cars) {
            System.out.println(elemen);
        }

    }
    
}
