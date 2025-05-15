package zzpp_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        /*
         * Iterator
         * Iterator adalah sebuah object yang dapat digunakan untuk melooping collections seperti ArrayList dan HashSet.
         */

         // buat collection
         ArrayList<String> cars = new ArrayList<String>();
         cars.add("Volvo");
         cars.add("BMW");
         cars.add("Ford");
         cars.add("Mazda");

         Iterator<String> it = cars.iterator();
         
         // mencetak item pertama
         System.out.println(it.next());

         // looping collection
         // untuk melooping gunakan method hashNext() dan next() dari Iterator
         while(it.hasNext()) {
            System.out.println(it.next());
         }

         // remove item dari sebuah collection
         ArrayList<Integer> numbers = new ArrayList<Integer>();
         numbers.add(100);
         numbers.add(200);
         numbers.add(9);
         numbers.add(3);
         numbers.add(500);

         Iterator<Integer> number = numbers.iterator();
         while(number.hasNext()) {
            Integer i = number.next();
            if (i < 10 ) {
                number.remove();
            }
         }

         System.out.println(numbers);

    }
    
}
