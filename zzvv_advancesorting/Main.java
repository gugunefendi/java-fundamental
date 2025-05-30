package zzvv_advancesorting;

import java.util.ArrayList;
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
         myCars.add(new Car("BWM", "X5", 1999));
         myCars.add(new Car("Honda", "Accord", 2006));
         myCars.add(new Car("Ford", "Mustang", 1970));

         Comparator<Car> myComparator = new SortByYear();
         Collections.sort(myCars,   myComparator);

         for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }


    }
        
}
