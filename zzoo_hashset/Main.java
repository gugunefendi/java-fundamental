package zzoo_hashset;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        /*
         * HashSet adalah sebuah collection dimana setiap itemnya harus unik
         */

         HashSet<String> cars = new HashSet<String>();

         // add item
         cars.add("BMW");
         cars.add("Mazda");
         cars.add("BMW");
         cars.add("Toyota");
         cars.add("BMW");

         // check sebuah item didalam hashitem
         boolean isNotEmpty = cars.contains("BMW");
         System.out.println(isNotEmpty);

         // size of hashset
         System.out.println(cars.size());

         // looping hashset
         for (String i: cars) {
            System.out.println(i);
         }

         // remove item
         cars.remove("Toyota");
         System.out.println(cars);

         // remove all items
         cars.clear();
         System.out.println(cars);

         // HashSet integer type
         HashSet<Integer> numbers = new HashSet<Integer>();
         numbers.add(4);
         numbers.add(7);
         numbers.add(8);

         // menamppilkan angka 1 - 10 yang telah di set
         for (int i = 0; i < 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " ditemukan didalam set");
            } else {
                System.out.println(i + " tidak ditemukan didalam set");
            }
         }

    }
    
}
