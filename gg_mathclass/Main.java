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
    }
    
}
