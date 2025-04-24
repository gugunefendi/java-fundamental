public class Main {

    public static void main(String[] args) {

        /*
        method adalah sebuah perilaku dari sebuah object
        seperti yang sudah kita jelaskan pada pelajaran sebelumnya:
        misalnya ada sebuah object Car, object Car ini memiliki perilaku maju, mundur, parkir, isi bensin dan lainnya
        perilaku-perilaku tersebut bisa disebut juga sebagai method.

        Ada 2 cara pemanggilan method:
        1. Panggil method secara langsung (tanpa memanggil class nya terlebih dahulu)
        1. Buat object lebih dulu sebelum panggil method
        2. Panggil method langsung dari nama class saja
        */
        
        /* 
        panggil method secara langsung
        ini bisa kita lakukan karena method greeting() berikut ada didalam class yang sama
        tambahkan access modifier static jika ingin buat method yang bisa dipanggil tanpa membuat object dulu
        */
        greeting();

        /*
         * buat object lebih dulu sebelum panggil method
         */
        Car car = new Car();
        car.display();

        /*
         * panggil method langsung dari nama class saja
         * tambahkan access modifier jika ingin buat method yang bisa dipanggil tanpa buat object dulu
         */

         Calculator.addition(10, 20);
    }

    static void greeting() {
        System.out.println("Hello Java");
    }
    
}
