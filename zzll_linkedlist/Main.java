package zzll_linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /*
         * LinkedList
         * adalah sebuah class yang dapat menyimpan banyak object dengan tipe yang sama, sama seperti ArrayList
         * 
         * Namun ada perbedaan cara kerja antara ArrayList dengan LinkedList
         * 
         * Cara kerja ArrayList
         * 1. ArrayList menyimpan data didalam array biasa di belakang layar
         * 2. Saat kita menambahkan elemen:
         *      Elemen dimasukkan ke array tersebut
         * 3. Jika kapasitas array sudah penuh:
         *      - Java akan membuat array baru yang lebih besar (biasanya ukuran 1.5x atau 2x dari sebelumnya)
         *      - Data dari array lama akan disalin ke array baru
         *      - Array lama dibuag
         * 
         * Kelebihan ArrayList
         *      1. Akses cepat via indeks
         *      2. Cocok untuk banyak data dan sedikit ubah
         * 
         * Kekurangan ArrayList
         *      1. Menambahkan atau menghapus di tengah list itu lambat, karena harus geser elemen lain
         * 
         * Cara Kerja LinkedList
         * 1. LinkedList menyimpan data dalam bentuk node atau container
         * 2. Setiap node punya:
         *      - Nilai (data)
         *      - Referensi ke node berikutnya (dan sebelumnya jika DoublyLinkedList)
         * 3. Untuk menambahkan elemen:
         *      - Buat node baru
         *      - Hubungkan node itu ke node lain (misalnya ditaruh ditengah atau akhir)
         *      - Tidak perlu geser elemen seperti di ArrayList
         * 
         * Kelebihan LinkedList
         *      1. Tambah atau hapus elemen di tengah cepat (cukup ubah link)
         *      2. Cocok untuk operasi banyak tambah/hapus
         * 
         * Kekurangan LinkedList
         *      1. Akses via indeks lambat karena harus iterasi dari awal sampai ke indeks tersebut
         *      2. Konsumsi memori lebih besar karena setiap node menyimpan referensi
         * 
         * 
         * Method-method dialam LinkedList
         * addFirst()       add item to the beginning list
         * addLast()        add item to the end of the list
         * removeFirst()    remove item from the beginning of the list
         * removeLast()     remove item from the end of the list
         * getFirst()       get item at the beginning of the list
         * getLast()        get item at the last of the list
         */

         LinkedList<String> cars = new LinkedList<String>();
         cars.add("Volvo");
         cars.add("BMW");
         cars.add("Ford");

         cars.addFirst("Mazda");
         System.out.println(cars);

         cars.addLast("Toyota");
         System.out.println(cars);

         System.out.println(cars.getFirst());

         cars.removeFirst();
         System.out.println(cars);
    }
    
}
