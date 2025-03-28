package basic.file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        /*
         * FileReader   =   Read the contents of a file as a stream of characters. One by one
         *                  read() returns an int value which contains the byte value
         *                  when read() return -1, there is no more data to be read
         */

         try {
            FileReader reader = new FileReader("D:/Success/java/java-fundamental/basic/file_reader/art.txt");
            int data = reader.read();
            while(data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         }

    }
    
}
