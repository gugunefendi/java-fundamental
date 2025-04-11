package kk_while;

public class Main {

    public static void main(String[] args) {
        /*
         * While Loop
         * While Loop akan mengulang blok kode selama kondisi yang di tentukan terpenuhi
         * Sintax
         * while (condition) {
         *  // block code to be executed
         * }
         * 
         * dalam contoh kode dibawah, kode dalam loop akan berjalan, berulang ulang, selama variabel (i)
         * kurang dari 5:
         * 
         * int i = 0;
         * while (i < 5) {
         *  System.out.println(i);
         *  i++; // jangan lupa untuk menambah variabel yang digunakan dalam kondisi, jika tidak, loop tidak akan pernah berakhir.
         * }
         * 
         */

         int i = 0;

         while( i < 5) {
            System.out.println(i);
            i++;
         }
    }
    
}
