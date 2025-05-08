package zzdd_innerclass;

public class Main {

    public static void main(String[] args) {
        /*
         * Di Java, class juga dapat di sarangkan atau class didalam class. 
         * Tujuan dari class bersarang adalah untuk mengelompokkan class-class terkait, yang membuat
         * kode kamu lebih muda di baca dan di kelola.
         * 
         * Untuk mengakses class didalam class, buatlah sebuah objek dari class luar kemudian
         * buatlah sebuah objek dari class dalam.
         * 
         * Kamu juga dapat membuat
         * 1. private (jika tidak ingin class dalam diakses dari luar)
         * 2. static (jika anda ingin mengaksesnya tanpa membuat objek dari class luar)
         * 
         */

         Outer outer = new Outer();
         Outer.Inner inner = outer.new Inner();
         
         System.out.println(outer.x + inner.y);


    }
    
}
