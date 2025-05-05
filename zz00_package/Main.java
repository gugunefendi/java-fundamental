package zz00_package;
import java.util.Scanner; //import class Scanner
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
         * Package didalam Java digunakan untuk mengelompokkan class-class terkait. Anggap saja
         * folder dalam direktori file.
         * Package digunakan untuk menghindari konflik nama, dan untuk menulis kode yang lebih
         * muda dikelola.
         * Package dibagi menjadi dua:
         * Package bawaan (package dari API Java)
         * Package yang dibuat oleh kita sendiri (programmer)
         * 
         * Package Bawaan
         * API Java adalah library class yang telah ditulis sebelumnya, yang dapat digunakan secara gratis.
         * Daftar lengkap API Java dapat dilihat di https://docs.oracle.com/javase/8/docs/api/
         * 
         * Library ini dibagi menjadi package dan class. Artinya kita dapat mengimpor satu class (beserta metode dan atributnya)
         * atau seluruh package yang berisi semua class.
         * 
         * Untuk menggunakan class atau package dari library, kita bisa menggunakan kata kunci 'import'
         * 
         * Sintaksis:
         * import package.name.Class; // import single class
         * import package.name; // import seluruh package
         * 
         * IMPORT CLASS
         * Mengimport class Scanner bawaan Java
         * import java.util.Scanner;
         * 
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter username")
         * 
         * IMPORT PACKAGE
         * Mengimport package util dari Java;
         * import java.util.*; // import seluruh class yang ada pada package util.
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Username: ");

         /*
          * menggunakan array list dari pakcage util
          */

          ArrayList<Integer> numbers = new ArrayList<Integer>();
          numbers.add(100);
          numbers.add(200);
          numbers.add(300);
          for (int number : numbers) {
            System.out.println(number);
          }

    }
    
}
