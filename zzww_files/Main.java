package zzww_files;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    
    public static void main(String[] args) 
    {
        /*
         * File Handling
         * File handling merupakan bagian penting dari sebuah aplikasi.
         * Java memiliki beberpa metode untuk membua, membaca, memperbarui dan menghapus file
         * 
         * File Handling Java
         * Class File dari package java.io memungkinkan kita untuk bekerja dengan file
         * cara menggunakan class File ini kita bisa membuat object dengan class File lalu tentukan nama file
         * atau nama direktori 
         */

         // untuk membuat file di Java menggunakan class File, kita bisa menggunakan method createNewFile()
         // method ini akan mengembalikkan nilai boolean.
         // jika sukses true dan false jika file sudah ada
         // Catatan:
         // jika menggunakan method ini, gunakan blok try dan catch 
         // dengan menggunakan try catch jika ada error akan mengembalikkan pengecualian IOException
         try {
            File myObj = new File("D:\\success\\java\\java-fundamental\\zzww_files\\filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exist.");
            }
         } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
         }

         // menulis file
         try {
            FileWriter myWriter = new FileWriter("two-file.txt");
            myWriter.write("I Love Java!");
            myWriter.close();
            System.out.println("Successfulyy wrote to the file");
         } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
         }
         


    }

}
