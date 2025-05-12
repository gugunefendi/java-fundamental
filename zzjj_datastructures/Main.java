package zzjj_datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        /*
         * Data Structure / Struktur Data
         * Struktur data adalah cara untuk menyimpan data dan mengatur data sehingga kamu dapat menggunakannya secara efisien.
         * 
         * Java meneyediakan banyak struktur data bawaan dalam package java.util.
         * 
         * Beberapa struktur data yang paling umum digunakan:
         * 1. ArrayList
         * 2. LinkedList
         * 3. Hashmap
         * 4. HashSet
         * 
         */

         /*
          * ArrayList
          * ArrayList adalah array yang dapat diubah ukurannya secara dinamis.
          * Memungkinkan kita menyimpan dan mengaksesnya berdasarkan indeks.
          */

          ArrayList<String> cars = new ArrayList<String>();
          cars.add("Toyota");
          cars.add("Honda");
          cars.add("Suzuki");
          System.out.println(cars);


          /*
           * LinkedList
           * adalah bekerja seperti ArrayList, tetapi menyimpan elemen-elemen dalam satu rantai atau node saling terhubung.
           */

           /*
            Kapan menggunakan ArrayList
            - Ketika sering mengakses data secara acak(misalnya: list.get(i))
            - Saat ukuran data tidak sering berubah-ubah secara bbesar

            Kapan Menggunakan LinkedList
            - Jika kita sering menambah/menghapus diawal atau tengah list
            - Saat tidak terlalu butuh akses data acak dengan cepat

            Conoth kasus:
            Pakai ArrayList
            Kita membangun E-Commerce. User sering melihat daftar produk dan memilih produk tertentu berdasarkan indeks (misalnya produk ke-10, ke-20 dll)
            Kenapa menggunakan ArrayList?
            - Data lebih sering diakses berdasarkan indeks
            - Jarang ada penambahan/penyisipan data di tengah-tengah

            Pakai LinkedList
            Ketika kita membangun sebuah fitur "undo" pada aplikasi teks editor, dimana setiap perubahan dimasukkan kedalam list,
            dan bisa dihapus/di-undo dari belakang.
            Kenapa menggunakan LinkedList?
            - Sering menambah atau menghapus dari ujung list (awal atau akhir)
            - Tidak butuh akses acak (random access)
            */

          LinkedList<String> users = new LinkedList<String>();
          users.add("Adi");
          users.add("Budi");
          users.add("Cici");
          System.out.println(users);

          /*
           * Hashmap
           * Hashmap adalah struktur data yang menyimpan data dalam bentuk pasangan kunci dan nilai (key-value pair).
           */

           HashMap<String, String> capitalCities = new HashMap<String, String>();
           capitalCities.put("England", "London");
           capitalCities.put("Germany", "Berlin");
           capitalCities.put("USA", "Washington DC");
           System.out.println(capitalCities);

           /*
            * HashSet
            HashSet adalah struktur data yang menyimpan sekumpulan elemen unik.
            HashSet tidak menyimpan pasangan key-value, hanya menyimpan elemen tannpa duplikat.
            */

            HashSet<String> mobil = new HashSet<String>();
            mobil.add("Volvo");
            mobil.add("BMW");
            mobil.add("Ford");
            mobil.add("BMW");
            mobil.add("Mazda");
            System.out.println(mobil);

            /*
             * Iterator
             * Ketika belajar data structure kita akan sering mendengar tentang iterator juga.
             * Sebuah iterator adalah cara untuk me-looping element-elemen didalam struktur data
             * 
             */
            Iterator<String> it = mobil.iterator();

            while(it.hasNext()) { // hasNext() mengembalikkan true jika masih ada elemenberikutnya
                System.out.println(it.next()); // next() mengembalikan elemen berikutnya dalam iterasi
            }

    }
    
}
