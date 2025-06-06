package basic.audio_java;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException { 

        Scanner scanner = new Scanner(System.in);

        File file = new File("D:/Success/java/java-fundamental/basic/audio_java/nussa.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while(!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"): clip.start();
                    break;
                case ("S"): clip.stop();
                    break;
                case ("R"): clip.setMicrosecondPosition(0);
                    break;
                case ("Q"): clip.close();
                    break;
                default: System.out.println("Not a valid response");
                    break;
            }

            System.out.println("Bye");

        }

    }
    
}
