package xx_constructor;

public class Main {

    int x;
    int a;
    int b;

    // membuat constructor untuk class Main
    public Main() {
        x = 5; // menginisialisasi atribut x menetapkan nilai x  = 5
    }

    public Main(int a, int b) { // membuat constructor parameter
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        /*
         * Constructor
         * Constructor adalah sebuah method khusus yang digunakan untuk menginisialisasi object.
         * Constructor dipanggil saat object dari suatu class dibuat.
         * Constructor dapat digunakan untuk menetapkan nilai awal untuk atribut object.
         * 
         * Penting:
         * Nama Constructor harus sama dengan nama class
         * Constructor tidak boleh memiliki tipe return seperti (void)
         */

         Main myObj = new Main(); // buat object dari class Main
         System.out.println(myObj.x);

         Main myObjSecond = new Main(100, 200);
         System.out.println(myObjSecond.a);
         System.out.println(myObjSecond.b);

    }
    
}
