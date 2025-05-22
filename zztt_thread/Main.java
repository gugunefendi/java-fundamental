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
         employee.start();
         System.out.println("Kode ini berjalan diluar thread");

         // membuat thread dengan implement ke interface Runnable
         // lihat class Company
         Company company = new Company();
         Thread thread = new Thread(company);
         thread.start();
         System.out.println("Kode ini berjalan di Thread");
    }
    
}
