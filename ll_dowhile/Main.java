package ll_dowhile;

public class Main {

    public static void main(String[] args) {
        /*
         * perbedaan while loop dengan do while adalah
         * jika while memeriksa kondisi dulu jika benar maka mengeksekusi kode blok.
         * jika do while akan akan mengeksekusi dulu kode blok meskipun itu salah, baru ia akan memeriksa kondisi
         */

         // contoh:
         int i = 0;
         do {
            System.out.println(i);
            i++;
         }
         while (i < 5);
    }
    
}