package zzee_abstraction;

public class Main {

    public static void main(String[] args) {
        /*
         * Class dan Method Abstract
         * Abstraksi adalah proses menyembunyikan detail tertentu dan hanya menampilkan informasi
         * penting kepada pengguna.
         * 
         * Abstraksi dapat dicapai dengan class abstract atau interface.
         * 
         * keyword abstract adalah modifiers non-access, digunakan untuk class dan method.
         * 
         * abstract class:
         * adalah class terbatas yang tidak dapat digunakan untuk membuat object (untuk mengaksesnya, harus diwarisi dari class lain)
         * 
         * abstract method:
         * hanya dapat digunakan dalam class abstract, dan tidak memiliki badan. Badan disediakan
         * oleh subclass.
         * 
         * abstract class dapat memiliki abstract method dan regular.
         * 
         * contoh:
         * abstract class Animal {
         *  public abstract void animalSound();
         *  public void sleep() {
         *      System.out.println("Zzz");
         *  }
         * }
         * dari kode diatas kita tidak mungkin membuat object dari class Animal.
         * Animal object = new Animal(); // ini akan error
         * 
         * Untuk mengakses abstract class, class tersebut harus diwarisi dari kelas lain.
         * 
         * Mari kita buat contoh kodenya.
         * lihat kode dibawah.
         */

         Cat cat = new Cat();
         cat.animalSound();
    }
    
}
