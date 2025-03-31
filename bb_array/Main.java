package bb_array;

public class Main {

    public static void main(String[] args) {
        /*
         * Array
         * Array adalah object kontainer yang menampung sejumlah nilai tetap dari suatu jenis.
         * Panjang array ditetapkan saat array dibuat.
         * Setiap item didalam array disebut elemen, dan di setiap elemen diakses berdasarkan indeks numeriknya.
         */

         // mendeklarasikan array bilangan bulat
         int[] anArray;

         // mengalokasikan memori untuk 10 bilangan bulat
         anArray = new int[10];

         // menginisialisasi elemen
         anArray[0] = 0;
         anArray[1] = 100;
         anArray[2] = 200;
         anArray[3] = 300;
         anArray[4] = 400;
         anArray[5] = 500;
         anArray[6] = 600;
         anArray[7] = 700;
         anArray[8] = 800;
         anArray[9] = 900;

         // akses element
         System.out.println(anArray[0]);
         System.out.println(anArray[1]);
         System.out.println(anArray[2]);
         System.out.println(anArray[3]);
         System.out.println(anArray[4]);
         System.out.println(anArray[5]);
         System.out.println(anArray[6]);
         System.out.println(anArray[7]);
         System.out.println(anArray[8]);
         System.out.println(anArray[9]);


         /*
          * Mendeklarasikan variabel untuk tipe data array
          pada contoh kode diatas kita mendeklarasikan sebuah variabel anArray dengan tipe data array int
          Seperti deklarasi untuk variabel tipe lain, deklarasi memiliki 2 komponen:
          1. tipe array
          2. nama array

          Contoh mendeklarasikan array dengan tipe data yang lain:
          byte[] anArrayOfBytes;
          short[] anArrayOfShorts;
          long[] anArrayOfLongs;
          float[] anArrayOfFloats
          double[] anArrayOfDoubles;
          boolean[] anArrayOfBooleans;
          char[] anArrayOfChars;
          String[] anArrayOfStrings;


          Membuat, menginisialisasi dan mengakses Array

          Salah satu cara untuk membuat array adalah dengan operator 'new' 
          anArray = int new[10];

          Menginisialisasi array / menetapkan nilai ke setiap elemen array
          anArray[0] = 100;
          anArray[1] = 200;
          anArray[2] = 300; // dan seterusnya

          Mengakses array menggunakan indeks numeriknya
          System.out.println(anArray[0]);
          System.out.println(anArray[1]);
          System.out.println(anArray[2]);

          kamu juga bisa menggunakan cara alternatif untuk membuat dan menginisialisasi array
          int[] anArray = {
            100, 200, 300, 400, 500, 600
          };

          Dengan cara ini panjang array ditentukan dengan nilai yang diberikan tanda kurung kurawal dan dipisahkan dengan koma        
          */

          boolean[] anBooleans;

          anBooleans = new boolean[4];

          anBooleans[0] = true;
          anBooleans[1] = false;
          anBooleans[2] = true;
          anBooleans[3] = false;

          System.out.println(anBooleans[0]);
          System.out.println(anBooleans[1]);
          System.out.println(anBooleans[2]);
          System.out.println(anBooleans[3]);

          double[] anDoubles;
          anDoubles = new double[3];
          anDoubles[0] = 3143;
          anDoubles[1]= 3143;
          anDoubles[2]= 3143;
          System.out.println(anBooleans[0]);
          System.out.println(anBooleans[1]);
          System.out.println(anBooleans[2]);

          String[] names = {"gunawan", "adi", "budi"};
          System.out.println(names[0]);
         
    }
    
}
