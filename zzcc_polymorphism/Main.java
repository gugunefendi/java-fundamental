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
         * Meskipun 
         */

         Animal animal = new Animal();
         animal.makeSound();

         Cat cat = new Cat();
         cat.makeSound();

         Bird bird = new Bird();
         bird.makeSound();


    }
    
}
