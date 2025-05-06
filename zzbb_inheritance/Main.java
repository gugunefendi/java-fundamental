package zzbb_inheritance;

class Main {

    public static void main(String[] args) {
        /*
         * Inheritance atau Pewarisan
         * Inheritance Java (subclass dan superclass)
         * 
         * Inheritance adalah dimana suatu class mewarisi atribut dan method dari class lain.
         * Konsep pewarisan dibagi menjadi dua:
         * 1. subclass (child) class yang mewarisi class lain
         * 2. superclass (parent) class yang diwarisi
         * 
         * Untuk mewarisi suatu class, gunakan kata kunci extends
         * 
         * Contoh:
         * kita punya superclass (parent) class bernama Kendaraan
         * lalu kita punya class Mobil yang mewarisi atribut dan method pada class Kendaraan.
         * class Kendaraan {
         *  protected String brand = "Toyota";
         *  public void klakson() {
         *      System.out.println("Tut, tuut!");
         *  }
         * }
         * 
         * class Mobil extends Kendaraan {
         *      public static void main(String[] args) {
         *          Mobil mobil = new Mobil();
         *          System.out.println(mobil.brand);
         *          mobil.klakson();
         *      }
         * }
         * 
         * Dari contoh diatas kita sudah bisa menggunakan atribut dan method yang ada pada Kendaraan di class Mobil (child)
         * 
         * JIKA ANDA TIDAK INGIN SUATU CLASS di warisi oleh class lain, GUNAKAN keyword final
         * contoh:
         * final class Kendaraan {
         * 
         * }
         */

         Mobil mobil = new Mobil();
         System.out.println(mobil.brand);
         mobil.klakson();
    }

}