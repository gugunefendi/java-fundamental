package yy_modifiers;

public class Main {

    public static void main(String[] args) {
            /*
             * Modifier dibagi menjadi dua:
             * 1. Access modifier
             * 2. Non Access modifier
             * 
             * 1. Access Modifier
             * Class:
             * public   : class dapat di akses dari class manapun
             * default  : class hanya dapat di akses dari package yang sama (ketika kamu tidak menentukan modifier secara spesifik maka modifier akan di set menjadi default)
             * 
             * Atribut, method dan constructor:
             * public   : dapat di akses dari class manapun
             * private  : hanya dapat diakses dari dalam class yang di deklarasikan
             * default  : dapat diakses dari package yang sama (ketika kamu tidak menentukan modifier secara spesifik)
             * protected: dapat diakses dari package yang sama dan dari sub class.
             * 
             * 2. Non access modifier
             * Class:
             * final    : class tidak dapat diwarisi oleh class lain
             * abstract : class tidak dapat digunakan untuk membuat object (untuk mengakses class abstract, class tersebut harus diwarisi dari class lain)
             * 
             * Atribut dan method
             * final    : atribut dan method tidak dapat di tetapkan ulang atau diubah
             * static   : atribut dan method dimiliki oleh class bukan miliki object
             * abstract : hanya dapat digunakan didalam class abstract dan hanya dapat digunakan di method
             * transient: atribut dan method dilewati saat melakukan serialisasi obejet yang memuatnya
             * synchronized : method hanya dapat diakses oleh satu thread pada satu waktu
             * volatile     : nilai atribut tidak di cache secara local di thread, dan selalu dibaca dari "memori utama"
             */
    }
    
}
