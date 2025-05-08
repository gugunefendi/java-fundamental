package zzcc_polymorphism;

public class Main {

    public static void main(String[] args) {
        /*
         * Polymorphism
         * Polymorphism artinya adalah "banyak bentuk" dan terjadi ketika kita 
         * memiliki banyak class yang salaing terkait melalui pewarisan.
         * 
         * Ketika kita menggunakan inheritance (pewarisan) kita dapat mewarisi atribut dan method dari
         * superclass. Polymorphism menggunakan metode tersebut untuk melakukan tugas yang berbeda.
         * 
         * Contoh:
         * Kita punya superclass Animal yang memiliki method animalSound().
         * Subclass dari Animal bisa berupa kucing, sapi, ayam, burung dll. dan mereka juga memiliki
         * suara yang berbeda. kucing (meong), ayam (kok kok) burung (cit cuit) dll.
         *  
         * Agar lebih jelas lihatlah pada contoh kode dibawah
         * 
         */

         Animal animal = new Animal();
         animal.makeSound();

         Cat cat = new Cat();
         cat.makeSound();

         Bird bird = new Bird();
         bird.makeSound();

         /*
          * Ada dua jenis polymorphism didalam Java
          1. compile-time polymorphism
          2. Runtime polymorphism

          1. Compile-time polymorphism (method overloading)
          Dicapai melalui method overloading, yaitu beberapa metode dalam satu kelas yang memiliki
          nama yang sama tapi parameter berbeda.
          misalnya kita punya class Math
          lalu punya dua method add yang menerima argumen berbeda
          class Math {
            public int function add(int a, int b) {
                return a + b;
            }

            public double add(double a, double b) {
                return a + b;
            }
          }

          2. Runtime polymorphism (method overriding)
          Dicapai melalui method overriding, yaitu ketika subclass memberikan implementasi berbeda
          terhadap metode yang sudah di definisikan di superclass
          Contohnya pada kode diatas. Dimana method makeSound sudah kita definisikan di super class
          lalu subclass meng-implementasikan method tersebut dengan cara yang berbeda.
          */


    }
    
}
