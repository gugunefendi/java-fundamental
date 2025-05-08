package zzff_interface;

public class Main {

    public static void main(String[] args) {
        /*
         * Cara lain untuk membuat abstraksi adalah dengan interface
         * Interface adalah class abstract digunakan untuk mengelompokkan method terkait tanpa body method.
         * 
         * contoh:
         * intreface Animal {
         *  public void animalSound();
         *  public void run();
         * }
         * 
         * untuk mengakses method interface, interface harus di implementasikan (mirip seperti pewarisan)
         * namun menggunakan keyword 'implements'
         * 
         * contoh:
         * interface Animal {
         *  public void animalSound();
         *  public void sleep();
         * }
         * 
         * class Cat implements Animal {
         *  public void animalSound() {
         *      System.out.println("Meow");
         *  }
         *  public void sleep() {
         *      System.out.println("Zzzz");
         *  }
         * }
         * 
         * class Main {
         *  public static void main(String[] args) {
         *      Cat cat = new Cat();
         *      cat.animalSound();
         *      cat.sleep();
         *  }
         * }
         * 
         * Catatan tentang Interface:
         * 1. Seperti abstract class, interface tidak dapat digunakan untuk membuat objek
         * 2. Method didalam interface tidak memiliki body, body disediakan oleh class yang mengimplement ke interface tsb
         * 3. Method interface secara default abstract dan public
         * 4. Atribut interface secara default adalah public, static dan final
         * 5. Suatu interface tidak dapat berisi constructor (karena tidak dapat digunakan untuk membuat object)
         * 
         * Mengapa dan kapan menggunakan interface?
         * 1. Untuk keamanan - sembunyikan rincian tertentu dan hanya tampilkan rincian penting dari suatu object
         * 2. Java tidak mendukung multiple inheritance. Namun, hal ini dapat dicapai dengan interface, karena class
         * dapat mengimplementasikan beberapa intreface. (untuk mengimplementasikan beberapa intergface, pisahkan dengan koma)
         */

         Cat cat = new Cat();
         cat.sound();
         cat.sleep();

         Dog dog = new Dog();
         dog.sound();
         dog.sleep();
    }
    
}
