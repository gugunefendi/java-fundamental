package zzmm_listsorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*
         * Collections adalah class utilitas dalam package java.util yang menyediakan
         * berbagai metode statis untuk mengoprasikan atau memanipulasi koleksi data seperti List, Set dan Map
         * 
         * dalam class Collection berisi metode-metode statis untuk:
         * 1. mengurutkan data
         * 2. mencari elemen
         * 3. menyalin elemen
         * 4. membalik urutan
         * 5. membuat koleksi tidak bisa dimodifikasi
         * 6. dan lain-lain
         */

         ArrayList<String> users = new ArrayList<>();

         users.add("Cici");
         users.add("Adi");
         users.add("Budi");

         // sorting data / mengurutkan data berdasarkan alaphabet
         Collections.sort(users);
         System.out.println(users);

         // reverse sort / membalik pengurutan
         Collections.sort(users, Collections.reverseOrder());
         System.out.println(users);

         // sorting data / mengurutkan berdasarkan angka

         ArrayList<Integer> scores = new ArrayList<Integer>();
         scores.add(40);
         scores.add(70);
         scores.add(60);
         scores.add(80);
         scores.add(30);

         Collections.sort(scores);
         
         for(int i: scores) {
            System.out.println(i);
         }

         




    }
    
}
