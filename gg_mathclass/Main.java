package gg_mathclass;

public class Main {

    public static void main(String[] args) {
        /*
         * Class Match pada java memiliki banyak method yang bisa kita gunakan
         * untuk melakukan operasi matematika pada angka
         * contoh:
         * Math.max(x, y) // mengembalikkan nilai maxima
         * Math.min(x, y) // mengembalikkan nilai minimal
         * Math.abs(x) // mengembalikkan nilai absolut
         * Math.sqrt(x) // mengembalikkan akar kuadrat
         * Math.random() // mengembalikkan nilai acak
         */

        //  Math.max()
         System.out.println(Math.max(12, 89));

         // metod diatas hanya menerima dua argumen, jika ingin mencari nilai maximal pada array gunakan loop
         int[] angka = {12, 3, 5, 77, 23, 6};
         int max = angka[0];  // asumsikan elemen pertama adalah yang terbesar

         for(int i = 0; i < angka.length; i++) {
            max = Math.max(max, angka[i]);
         }

         System.out.println("Nilai terbesar dari array adalah: " + max);

         // Math.min()
         // mengembalikkan nilai terkecil
         System.out.println(Math.min(5, 10)); // output 5

         // Math.sqrt()
         // mengembalikkan nilai akar kuadrat
         System.out.println(Math.sqrt(64));

         // Math.abs()
         // Mengembalikkan nilai abosulte (positif)
         System.out.println(Math.abs(-4.7)); //output 4.7

         // Math.random()
         // Mengembalikkan nilai acak antara 0.0 (inklusif) dan 1.0 (eksklusif)
         System.out.println(Math.random());

         System.out.println((int) (Math.random() * 10)); // tambahkan rentan antara 0 - 10

         System.out.println((int) (Math.random() * 100) + 1); // tambahkan rentan antara 1 - 100

    }
    
}
