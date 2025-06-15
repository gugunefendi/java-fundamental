package zzyy_anotation;

public class Main {

    public static void main(String[] args) {
        /*
         * Java Anotation adalah catatan spesial yang di tambahkan kedalam kode java
         * Diawali dengan simbol @
         * Anotation tidak akan mengubah jalannya kode
         * Anotation hanya memberikan informasi tambahan ke compiler atau tools
         * 
         * Built in Anotaion
         * Ada 3 anotaion bawaan dari Java
         * 1. @Override         // menunjukkan bahwa suatu metode menggantikan metode di superclass
         * 2. @Deprecated       // menandai bahwa suatu metode sudah usang atau tidak di sarankan digunakan
         * 3. @SupressWarnings  // memberitahu compiler untuk mengabaikan peringatan tertentu
         */

         Animal animal = new Animal();
         animal.makeSound();

         Cat cat = new Cat();
         cat.makeSound();

         cat.oldMethod();
    }
    
}
