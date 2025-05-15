package zzrr_exception;

public class Main {

    public static void main(String[] args) {
        /*
         * Exceptions - Try... Catch
         * Try Catch digunakan untuk menangani pengecualian
         * Blok try = memungkinkan kita untuk menentukan blok kode yang akan diuji untuk mengetahui kesalahannya
         * saat sedang dieksekusi
         * Blok catch = memungkinkan kita untuk menentukan blok kode yang akan di eksekusi,
         * jika terjadi kesalahan dalam blok try
         * 
         * try {
         *  // blok kode yang diuji
         * }
         * catch(Exception e) {
         *  // blok kode untuk menangani eror
         * }
         * 
         */

         // contoh
        //  int[] numbers = {1, 2, 3};
        //  System.out.println(numbers[10]);
         // kode diatas akan menampilkan eror
         // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3

         // tapi jika kita gunakan try catch maka kita menangkap kesalahan tersebut dan menjalankan beberapa kode
         // untuk mengatasinya
         try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
         }
         catch (Exception e) {
            System.out.println("Something went wrong");
         }
         finally { // akan selalu di eksekusi apaun hasil dari try catch
            System.out.println("Try catch is finishid");
         }

         /* throw keyword
         throw statement dapat kita gunakan untuk membuat custom error
         throw statement digunakan bersamaan dengan tipe exception, ada banyak tipe exception didalam Java
         diantaranya: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
         */

         //contoh penggunaan statment throw
         checkAge(15);


    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Akses ditolak, anda harus berusia 18 tahun +");
        } else {
            System.out.println("Anda diberikan akses");
        }
    }
    
}
