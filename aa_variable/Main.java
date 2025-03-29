package aa_variable;

public class Main {

    public static void main(String[] args) {

                /*
        Penamaan Variabel
        1. Peka terhadap huruf besar-kecil
        2. Dimulai dengan huruf
        3. Boleh menggunakan $ atau _ namun tidak dianjurkan untuk mengawali nama varibel dengan $ atau _
        4. Tidak boleh spasi
        5. Menggunakan gaya camelCase
        6. Tidak boleh mengandung keyword tertentu misalnya integer, this atau static
        7. Jika variabel menyimpan nilai konstan gunawan UPPERCASE dan pisahkan setiap kata menggunakan _ contoh NUM_GEARS

        Primitive Data Type
        Java adalah bahasa pemrograman yang memiliki tipe statis, yang mana variabel harus di deklarasikan terlebih dahulu
        sebelum digunakan, termasuk mendeklarasikan tipe datanya juga, contoh:
        1. int gear = 1;
        2. char grade = 'A';
        3. boolean isMale = true;

        Dengan melakukan hal tersebut program kita akan diberitahu bawah variabel dengan gear ada dan berisi data numerik.

        Java memiliki 8 tipe data primitive:
        
        Data Type    Size        primitive/reference     Value
        boolean      1 bit       primitive               true or false
        byte         1 byte      primitive               -128 to 127
        short        2 bytes     primitive               -32.768 to 32.767
        int          4 bytes     primitive               -2 billion to 2 billion
        long         8 bytes     primitive               -9 quintillion to 9 quintillion
        float        4 bytes     primitive               fractional number up to 6-7 digits, ex. 3.141592f
        double       8 bytes     primitive               fractional number up to 15 digits, ex. 3.413498756784323
        char         2 bytes     primitive               single character / letter / ASCII, ex. 'f'
        
        Literal Integer
        Literal integer dengn tipe long harus di akhiri dengan huruf 'L', jika tidak maka akan bertipe int.

        Literal Float
        Literal dengan tipe float harus di akhiri dengan 'f', jika tidak maka tipenya akan double.

        Literal char dan String
        Gunakan kutip satu '' untuk char dan kutip dua "" untuk string.
        */

        /*
         * Ketika membuat variabel sebagai atribut object tidak perlu di inisalisasi
         * karena variabel akan diberikan nilai default oleh java
         * contoh:
         * class Example {
         *      int myInt;
         *      double myDouble;
         * }
         * 
         * Namun jika membuat variabel lokal (didalm method variabel harus di inisialisai),
         * Kalau tidak akan error
         * contoh:
         * class Example2 {
         *      public static void main(String[] args) {
         *          int myInt = 0;
         *          double myDouble = 0;
         *      }
         * }
         */

        // mendeklarisikan varibel
        byte myByte = 126;
        double myDouble = 14.12345678912345;
        short myShort = 32600;
        float myFloat = 12.1234567f;
        int myInt = 1000000;
        long myLong = 23232878765656655L;
        char myChar = 'A';

        System.out.println(myByte);
        System.out.println(myDouble);
        System.out.println(myShort);
        System.out.println(myFloat);
        System.out.println(myLong);
        System.out.println(myChar);

    }
    
}
