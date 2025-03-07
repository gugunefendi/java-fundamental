package basic.logical_operator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Logical operator = use to connect two or more expressions
        // && = (AND) both condition must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition

        // && (AND)
        int temp = 25;
        
        if(temp > 30) {
            System.out.println("It is hot outside");
        }
        else if(temp >= 20 && temp <=30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }

        // || (OR)
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You are still playing the game *pew pew*");
        }

        scanner.close();

        // ! (NOT)
        boolean isCompleted = true;
        if(!isCompleted) {
            System.out.println("It's Not completed yet");
        }
        else {
            System.out.println("It is completed");
        }
    }
    
}
