package uu_classobject;

public class Main {

    int x = 5;

    public static void main(String[] args) {
        /* 
        Segala sesuatu di Java dikaitkan dengan class dan object, beserta atribute dan metodenya. Misalnya:
        dalam kehidupan nyata, mobil adalah object. Mobil memiliki atribut seperti warna, merek, dan tahun pembuatan
        dan memiliki metode (perilaku) seperti maju, mundur, isibensi dan parkir.
        
        Untuk membuat class gunakan kata kunci class
        Seperti di class ini, kita ada di class Main
        */

        // membuat object Main
        // dan mengakses atribut x
        Main myObj1 = new Main();
        System.out.println(myObj1.x);

        Main myObj2 = new Main();
        System.out.println(myObj2.x);

        /*
        Membuat object dari suatu class dan mengaksesnya di kelas lain.
        Hal ini sering dilakukan untuk pengorganisasian class yang lebih baik (suatu class memiliki semua atribut
        dan metode, sementara class lainnya menyimpan metode main() (kode yang akan di eksekusi)).

        Kita sudah membuat class Car di file Car.java
        Sekarang kita buat object Car di class Main
        Lalu eksekusi program pada method main di class Main
        */

        // buat object Car
        Car carOne = new Car();

        // Cetak dan panggil atribut color
        System.out.println(carOne.color);

    }
    
}
