package zztt_thread;

public class Main {

    public static void main(String[] args) {
        /*
         * Thread
         * Thread memungkinkan suatu program beroperasi lebih efisien dengan melakukan banyak hal
         * pada saat bersamaan.
         * 
         * Thread dapat digunakan untuk melakukan tugas rumit di latar belakang
         * tanpa mengganggu program utama.
         * 
         * MEMBUAT THREAD
         * ada dua cara untuk membuat thread:
         * 1. Mengextends ke class Thread
         * 2. Mengimplement ke interface Runnable
         */

         // membuat thread dengan mengextends ke class Thread
         // lihat pada class Employee
         Employee employee = new Employee();
         // menjalankan thread
         employee.start();
         System.out.println("Kode ini berjalan diluar thread");

         // membuat thread dengan implement ke interface Runnable
         // lihat class Company
         Company company = new Company();
         Thread thread = new Thread(company);
         // menjalankan thread
         thread.start();
         System.out.println("Kode ini berjalan di Thread");

         /*
          * Perbedaan membuat thread dengan meng-extends class Thread dan dengan meng-implement ke class Runnable adalah:
          kalau pakai extends kita tidak dapat mengextends class lainnya
          namun kalau pakai implement kita masih bisa mengextends class yang lain
          lebih disarankan meng-implement ke class Runnable
          */

          /*
           * Concurency
           * Concurency adalah konsep dalam pemrograman dimana beberapa tugas (tasks) bisa berjalan
           * secara tumpang tindih (overlapping), bukan selalu harus secara berurutan satu persatu.
           */

           // Masalah akan muncul jika kita menggunakan dua atau lebih thread untuk mengakses dan memodifikasi
           // data yang sama di waktu yang tumpang tindih.
           // karena nilainya tidak bisa akurat atau membingungkan

           // contoh masalah yang terjadi jika kita menggunakan dua thread atau lebih untuk mengakses atau modifikasi data yang sama
           Concurent concurent = new Concurent(); // buat object
           Thread task1 = new Thread(concurent); // buat thread
           task1.start(); // jalankan thread
           System.out.println(concurent.amount); // bisa 0 atau 1 tergantung siapa duluan
           concurent.amount++; // thread utama menambah amount
           System.out.println(concurent.amount); // bisa 1 atau 2

           // solusinya gunakan method isAlive() untuk menunggu thread selesai
           Concurent concurent2 = new Concurent();
           Thread task2 = new Thread(concurent2);
           task2.start();
           while(task2.isAlive()) {
            System.out.println("Waiting...");
           }
           System.out.println("Concurent: " + concurent2.amount);
           concurent2.amount++;
           System.out.println("Concurent: " + concurent2.amount);

    }
    
}
