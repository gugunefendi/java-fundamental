package zzhh_scanner;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
         * Scanner adalah class yang digunakan untuk mendapatkan inputtan dari user
         * class Scanner dapat ditemukan di packaget java.util
         * 
         * Untuk menggunakan class Scanner, buatlah sebuah objek dari class tersebut
         * dan gunakan salah satu method yang tersedia dalam class tersebut.
         * 
         * Daftar method yang digunakan untuk membaca inputtan
         * nextBoolean()	Reads a boolean value from the user
         * nextByte()	    Reads a byte value from the user
         * nextDouble()	    Reads a double value from the user
         * nextFloat()	    Reads a float value from the user
         * nextInt()	    Reads a int value from the user
         * nextLine()	    Reads a String value from the user
         * nextLong()	    Reads a long value from the user
         * nextShort()	    Reads a short value from the user
         * 
         */

         Scanner sc = new Scanner(System.in); //create scanner object
         System.out.println("Enter username: ");

         String username = sc.nextLine(); //read user input
         System.out.println("Hello " + username);
    }
    
}
