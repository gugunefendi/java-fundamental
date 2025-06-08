package zzww_files;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

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

         // read file
         // untuk membaca text didalam sebuah file kita bisa menggunakan class Scanner
         try {
            File myFile = new File("D:\\success\\java\\java-fundamental\\zzww_files\\two-file.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()) {
               String data = myReader.nextLine();
               System.out.println(data);
            }
            myReader.close();
         } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
         }

         // mendapatkan informasi dari file
         File getFile = new File("D:\\success\\java\\java-fundamental\\zzww_files\\two-file.txt");
         if (getFile.exists()) {
            System.out.println("File name: " + getFile.getName());
            System.out.println("Absolute path: " + getFile.getAbsolutePath());
            System.out.println("Writeable: " + getFile.canWrite());
            System.out.println("Readable " + getFile.canRead());
            System.out.println("File size in bytes " + getFile.length());
         } else {
            System.out.println("File does not exist.");
         }

         // delete file
         // untuk menghapus file kita bisa menggunakan method delete
         
         try {
            File file3 = new File("D:\\success\\java\\java-fundamental\\zzww_files\\thirdfile.txt");
            if (file3.createNewFile()) {
               System.out.println("File3 created");
            }

            if (file3.exists()) {
               System.out.println("File exist, ready to delete");
            }

            if (file3.delete()) {
               System.out.println("Delete file successfully");
            } else {
               System.out.println("Failed delete file");
            }

         } catch (IOException e) {
            System.out.println("Error");
         }

    }

}
