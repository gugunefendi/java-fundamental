package zzkk_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*
         * ArrayList
         * adalah array dinamis, dapat ditemukan di package java.util
         */
        ArrayList<String> cars = new ArrayList<String>(); // ,membuat object arraylist

        // menggunakan method add untuk menambahkan elemen
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);

        // menggunakan method add(key, value ) untuk menambahakan ke posisi tertentu
        cars.add(2, "Lambhorgini");
        System.out.println(cars);

        // akses elemen menggunakan index
        System.out.println(cars.get(0));

        // ubah elemen
        cars.set(0, "Toyota");
        System.out.println(cars);

        // menghapus elemen didalam index tertentu
        cars.remove(0);
        System.out.println(cars);

        // menghapus seluruh elemen
        // cars.clear();
        System.out.println(cars);

        // mencetak jumlah elemen
        int elements = cars.size();
        System.out.println(elements);


        // Looping array menggunakan for loop
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // Looping array menggunakan foreach
        for(String car: cars) {
            System.out.println(car);
        }

        /*
         * Sort (urutkan) Array List
         * Didalam package java.util ada class Collections yang memiliki method sort()
         * dan berguna banget buat sorting (mengurutkan) list berdasarkan abjad atau angka
         * 
         */
        System.out.println("===================");
        Collections.sort(cars);
        for(String car: cars) {
            System.out.println(car);
        }

        // contoh array list menggunakan tipe data integer
        System.out.println("===================");
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(100);
        scores.add(90);
        scores.add(10);
        scores.add(30);

        Collections.sort(scores);
        for(int score: scores) {
            System.out.println(score);
        }


    }
    
}
