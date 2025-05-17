package zzss_regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        /*
         * REGEX (regular expressions)
         * Apa itu regular expression?
         * Regular expression adalah serangkaian karakter yang membentuk pola pencarian.
         * Ketika kita mencari data di dalam teks, kita dapat menggunakan pola pencarian ini untuk menjelaskan
         * apa yang kita cari.
         * 
         * Regular expression dalam berupa karakter tunggal atau pola yang lebih rumit.
         * 
         * Regular expression dapat digunakan untuk melakukan semua jenis operasi pencarian teks dan penggantian teks.
         * 
         * Java tidak memiliki class Expression Regular bawaan, tetapi kita dapat meng-import java.util.regex paket ini
         * memiliki class-class yang dapat kita gunakan untuk bekerja dengan regular expression.
         * class-class tersebut diantaranya:
         * 1. Pattern class - Menentukan pola (yang akan digunakan dalam pencarian)
         * 2. Matcher class - Digunakan untuk mencari pola
         * 3. PatternSyntaxException class - Menunjukkan kesalahan sintaksis dalam pola regular expression
         * 
         * Contoh:
         * // membuat sebuah pola menggunakan class Pattern dan method compile. 
         * // Parameter pertama menunjukkan pola yang kita cari, parameter kedua menunjukkan bahwa
         * // pencarian tidak harus peka huruf besar/kecil. Parameter kedua bersifat opsional.
         * Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
         * 
         * // method matcher digunakan untuk mencari pola didalam string. Method ini mengembalikkan objek Matcher
         * // yang berisi informasi tentang pencarian yang dilakukan
         * Matcher matcher = pattern.matcher("Java Developer");
         * 
         * // method find mengembalikkan true jika ditemukan dan false jika tidak
         * boolean matchFound = matcher.find();
         * 
         * if(matchFound) {
         *  System.out.println("Match Found");
         * } else {
         *  System.out.println("Match not found");
         * }
         */

         Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
         Matcher matcher = pattern.matcher("I love java");
         boolean matchFound = matcher.find();
         if(matchFound) {
            System.out.println("Match Found");
         } else {
            System.out.println("Match Not Found");
         }

         /*
          * Pola dalam Regular Expression
          Patameter pertama dari metode Pattern.compile() adalah pola. Pola ini menjelaskan apa yang sedang kita cari

          Expression    Description
          [abc]         Mencari 1 karakter diantara tanda kurung (a, b, atau c)
          [^abc]        Mencari 1 karakter yang tidak ada diantara tanda kurung (huruf apapun kecuali a, b atau c)
          [0-9]         Mencari 1 karakter antara 0 sampai 9 (1, 2, 3 sampai 9)
          */

          String myPattern = "[abc]";
          Pattern pattern1 = Pattern.compile(myPattern, Pattern.CASE_INSENSITIVE);
          Matcher matcher2 = pattern1.matcher("AiuEo");
          boolean isMatch = matcher2.find();
          if(isMatch) {
            System.out.println("Yes is match");
          } else {
            System.out.println("No Not Match!");
          }

          String myPattern3 = "[^x]";
          Pattern pattern3 = Pattern.compile(myPattern3);
        //   Matcher matcher3 = pattern3.matcher("a"); // return true karena huruf a bukan x 
          Matcher matcher3 = pattern3.matcher("x"); // return false karena huruf x cocok dengan pola
          boolean isMatch3 = matcher3.find();

          if(isMatch3) {
            System.out.println(true);
          } else {
            System.out.println(false);
          }

          // Start pola mencari 0 - 9

          String input = "Ada angka 5 dan 9 di sini, tapi bukan huruf a atau b.";

          Pattern pattern4 = Pattern.compile("[0-9]");
          Matcher matcher4 = pattern4.matcher(input);

          System.out.println("Angka yang ditemukan:");

          while (matcher4.find()) {
              System.out.println("Karakter: " + matcher4.group() + " pada index: " + matcher4.start());
          }

          // end

          /*
           * Metacharacter
           * Metacharacter adalah character dengan makna khusus
           * Simbol   Fungsi                                                    Contoh
           * |        OR | atau                                                 cat|dog|fish
           * .        DOT | mewakili satu karakter apapun, kecuali new line \n  a.c (jika abc, a-c atau axc maka cocok)
           * ^        CARET | cocok dengan awal string                          ^hello ("hello world" => hello cocok karena awal string)
           * $        DOLAR | cocok dengan akhir string                         $world ("hello world" => world cocok karena akhir string)
           * \d       DIGIT | mencari angka 0-9                                 \\d ("ini adalah angka 9" => 9 cocok karena angka)
           * \s       WHITESPACE | spasi, tab, newline                          \\s ("hello world" => " " spasi cocok antara hello dan world)
           * \b       BOUNDARY | mencocokkan batas kata                         \bword ("wordplay is not word" => word cocok karena bukan bagian dari kata lain)
           * 
           */

           Pattern pattern5 = Pattern.compile("cat|dog|fish");
           Matcher matcher5 = pattern5.matcher("I have dog, cat and fish in my house");
          //  boolean isMatch5 = matcher5.find();
           while (matcher5.find()) {
              System.out.println(matcher5.group() + " index ke " + matcher5.start());
           }

    }
    
}
