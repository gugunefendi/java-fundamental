package ff_string;

public class Main {

    public static void main(String[] args) {
        /*
         * String
         * Digunakan untuk menyimpan teks
         * 
         * String dalam Java sebenarnya adalah objek, yang memiliki method untuk melakukan operasi tertentu
         * Misalnya
         * length()
         * indexOf()
         * join()
         * charAt()
         * equals()
         * replace()
         * split()
         * toLowerCase()
         * toUpperCase()
         * dll
         */

         String username = "Gunawan Efendi";
         System.out.println(username.toLowerCase());
         System.out.println(username.toUpperCase());
         System.out.println(username.length());
         System.out.println(username.isEmpty());

         String[] splittedUsername = username.split(" ");
         for(String name : splittedUsername) {
            System.out.println(name);
         }

         /*
          * SPECIAL CHARACTER
          untuk menambahakan spesial karakter di dalam java kamu harus menambahkan backsplash
          contoh salah: String text = "Ini adalah tutorial "Java" yang keren"; // SALAH
          contoh benar: String text = "Ini adalah tutorial \"Java\" yang keren"; // BENAR
          kamu juga menggunakan escape lain:
          1. \n new line
          2. \t tab
          3. \b backsplash
          */

          String text = "Ini adalah tutorial \"Java\" yang keren";
          System.out.println(text);

          String textTwo = "Saya akan menjadi \"PROGRAMMER\" dengan gaji 100juta per bulan \t Saya Yakin!";
          System.out.println(textTwo);

    }
    
}
