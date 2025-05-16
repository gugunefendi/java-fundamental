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
          [abc]         Mencari 1 karakter diantara tanda kurung
          [^abc]        Mencari 1 karakter yang tidak diantara tanda kurung
          [0-9]         Mencari 1 karakter antara 0 sampai 9 
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

    }
    
}
