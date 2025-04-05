package dd_scanner;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username (should be start with 'A')");
        String username = sc.nextLine();
        String pattern = "^[Aa].*";
        boolean match = Pattern.matches(pattern, username);
        if(!match) {
            System.out.println("Username should be start with 'A or a'");
            sc.close();
            return;
        }
        System.out.println("Good " + username);
        sc.close();

    }
    
}
