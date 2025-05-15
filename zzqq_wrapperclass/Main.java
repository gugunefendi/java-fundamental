package zzqq_wrapperclass;

public class Main {

    public static void main(String[] args) {
        /*
         * Wrapper Class
         * Wrapper Class menyediakan sebuah cara untuk menggunakan tipe data primitive 
         * (int, boolean, float, double, char dll) sebagai object.
         * 
         * Tipe data primitive  Wrapper Class
         * byte                 Byte
         * short                Short
         * int                  Integer
         * long                 Long
         * float                Float
         * double               Double
         * boolean              Boolean
         * char                 Character
         * 
         * Terkadang kamu harus menggunakan wrapper class, sebagai contoh ketika kamu bekerja 
         * dengan object-object Collection, seperti ArrayList, dimana tipe data primitive tidak dapat digunakan
         * karena (list hanya dapat menyimpan object)
         * ArrayList<int> numbers = new ArrayList<>(int); // ini akan error
         * solusinya gunakan class wrapper
         * ArrayList<Integer> numbers= new ArrayList<>(int); // ya ini valid
         * 
         */

         //untuk membuat object wrapper gunakan wrapper class, bukan tipe primitive
         Integer integerNumber = 100;
         Double doubleNumber = 5.99;
         Character myChar = 'A';
         System.out.println(integerNumber);
         System.out.println(doubleNumber);
         System.out.println(myChar);
         
         // karena kita variabel-variabel diatas adalah object, kita dapat menggunakan method-method tertentu
         // untuk mendapatkan informasti tentang object-object tersebut.
         // contoh menggunakan method untuk mencetak value dari sebuah object wrapper
         System.out.println(integerNumber.intValue());
         System.out.println(doubleNumber.doubleValue());
         System.out.println(myChar.charValue());

         // method lain yang sering berguna adalah toString(), method ini untuk mengubah object wrapper menjadi string
         System.out.println(integerNumber.toString());
         
         // method length untuk mencetak panjang string
         String myString = integerNumber.toString();
         System.out.println(myString.length());
    }
    
}
