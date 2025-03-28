package basic.file_class;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        // File = An abstract representation of file and directory pathnames

        File file = new File("D:/success/java/java-fundamental/basic/file_class/simple.txt");

        if(file.exists()) {
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            // System.out.println(file.isFile()); // print true
            // file.delete(); // will delete the file
        }
        else {
            System.out.println("That file doesn't exist!");
        }

    }
    
}
