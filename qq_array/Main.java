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

        // array multidimension
        // array multidimensi adalah array didalam array
        // array multidimensi berguna ketika kita ingin menyimpan data seperti tabel (dengan baris dan kolom)
        // contoh
        // name    address     position
        // Adi     Jakarta     Web Developer
        // Budi    Bandung     Mobile Developer
        // Cici    Surabaya    Designer

        String[][] employees = { {"Adi", "Jakarta", "Web Developer"}, {"Budi", "Bandung", "Mobile Developer"}, {"Cici", "Surabaya", "Designer"} };
        
        // akses element
        System.out.println(employees[0][1]);

        // ubah value pada element
        employees[0][1] = "Medan";
        System.out.println(employees[0][1]);

        // loop array multidimensi
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees[i].length; j++) {
                System.out.println(employees[i][j]);
            }
        }

        // loop array multidimensi menggunakan foreach
        int[][] myNumbers = {{1,2,3}, {4,5,6}};
        for (int[] i : myNumbers) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }
    
}
