package basic.scanner;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        /*
         * Method        Data Type              Use
         * next()        string without space   input.next()
         * nextLine()    string with space      input.nextLine()
         * nextInt()     int                    input.nextInt()
         * nextDouble()  double                 input.nextDouble()
         * nextFloat()   float                  input.nextFloat()
         * nextBoolean() boolean                input.nextBoolean()
         * nextLong()    long                   input.nextLong()
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Whats your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Name\t\t : " + name);
        System.out.println("You are\t\t : " + age + " years old");
        System.out.println("You like\t : " + food);

        scanner.close();

    }

}