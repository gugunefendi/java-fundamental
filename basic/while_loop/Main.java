package basic.while_loop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // while loop = executes a block of code as long as a it's condition remians true
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.print("Enter your name\t: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
        scanner.close();
    }
    
}
