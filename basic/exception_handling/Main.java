package basic.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // exception =  an event that occurs during the exception fo a program that,
        //              disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
        } catch(ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        } catch(InputMismatchException e) {
            System.out.println(e);
        } catch(Exception e) {
            System.out.println("Something is wrong!");
        } finally {
            System.out.println("Will always print");
            scanner.close();
        }

    }
    
}
