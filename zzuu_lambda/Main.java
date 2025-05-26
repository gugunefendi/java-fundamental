package zzuu_lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        /*
         * Java Lambda expression
         * Lambda expression ditambahkan di Java 8
         * Lambda expression adalah blok kode pendek yang mengambil parameter dan mengembalikkan nilai
         * 
         * Syntax:
         * parameter -> expression
         * (parameter1, parameter2) -> expression // gunakan tanda kurang jika parameter lebih dari 1
         * 
         */

         // contoh menggunakan lambda
         ArrayList<Integer> numbers = new ArrayList<Integer>();
         numbers.add(5);
         numbers.add(9);
         numbers.add(8);
         numbers.add(1);
         numbers.forEach( (n) -> { System.out.println(n); });

         /*
          * Lambda expression dapat disimpan dalam variabel jika variabel tersebut adalah interface 
          yang hanya memiliki satu metode. Ekspresi lambda harus memiliki jumlah paramter yang sama
          dan tipe pengembalian yang sama dengan metode tersebut. Java memiliki banya Interface jenis ini,
          seperti contoh interface Consumer (yang terdapat dalam package java.util)
          */

          // contoh
          ArrayList<String> users = new ArrayList<String>();
          users.add("Adi");
          users.add("Budi");
          users.add("Cici");
          Consumer<String> method = (n) -> { System.out.println(n); };
          users.forEach(method);
    }
    
}
