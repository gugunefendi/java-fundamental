package zzvv_advancesorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        /*
         * Comparators
         * Comparators adalah sebuah object yang meng-implements ke interface Comparator.
         * 
         * Interface Comparator mengizinkan kita untuk membuat sebuah class dengan method compare() yang dapat
         * membandingkan dua object untuk memutuskan object mana yang harus didahulukan didalam list.
         * 
         * Method compare() harus mengembalikkan sebuah nilai ang mana:
         * - Negatif jika object pertama harus berada pada urutan pertama didalam list
         * - Positif jika object kedua harus di urutan pertama pada list
         * - 0 jika  urutannya tidak penting
         */

         ArrayList<Car> myCars = new ArrayList<Car>();
         myCars.add(new Car("BMW", "X5", 1999));
         myCars.add(new Car("Honda", "Accord", 2006));
         myCars.add(new Car("Ford", "Mustang", 1970));

        //  Comparator<Car> myComparator = new SortByYear();
        //  Collections.sort(myCars,   myComparator);

         // menggunakan lambda expression
         // kalau menggunakan lambda expression kita ga perlu lagi class SortByYear
         // kode lebih singkat
         Collections.sort(myCars, (obj1, obj2) -> {
            Car a = (Car) obj1;
            Car b = (Car) obj2;
            if (a.year < b.year) return -1;
            if (a.year > b.year) return 1;
            return 0;
         });

         for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

        // Comparator juga dapat digunakan untuk membuat sorting khusus untuk String dan number
        // contoh berikut ini kita akan menggunakan comparator untuk mencantumkan semua angka genap sebelum ganjil
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Comparator<Integer> myComparator = new SortEvenFirst();
        Collections.sort(myNumbers, myComparator);

        for (int i: myNumbers) {
            System.out.println(i);
        }


    }
        
}
