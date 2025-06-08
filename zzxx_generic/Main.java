package zzxx_generic;

public class Main {

    public static void main(String[] args) {
        /*
         * Java Generic
         * Java Generic memungkinkan kita untuk menulis class, interface, 
         * dan method yang dapat bekerja dengan tipe data yang berbeda.
         * 
         * Mengapa menggunakan Generic?
         * 1. Reusable code: 1 class atau method bisa berfungsi dengan tipe data yang berbeda
         * 2. Keamanan tipe: menangkap kesalahan tipe pada waktu kompilasi, bukan pada waktu proses
         * 3. Clean code: tidak perlu casting saat mengambil objek 
         */

         // class generic

         // box dalam tipe data string
         Box<String> stringBox = new Box<>();
         stringBox.set("Hello");
         System.out.println("Value: " + stringBox.get());

         // box dalam tipe data integer
         Box<Integer> intBox = new Box<>();
         intBox.set(100);
         System.out.println("Value: " + intBox.get());

         // method generic
         String[] names = {"Adi", "Budi", "Cici"};
         Integer[] numbers = {1, 5, 9};

         printArray(names);
         printArray(numbers);
    }

    // method generic
    public static <T> void printArray(T[] array) {
        for (T item: array) {
            System.out.println(item);
        }
    }
    
}
