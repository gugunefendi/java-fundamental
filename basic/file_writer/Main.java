package basic.file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:/Success/java/java-fundamental/basic/file_writer/poem.txt");
            writer.write("Rose are red \nViolets are blue \nBooty booty booty \nRockin' Everywhere");
            writer.append("\n(Poem By Gunawan)");
            writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
