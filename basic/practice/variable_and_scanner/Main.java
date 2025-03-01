package basic.practice.variable_and_scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // next
        // first string before space
        System.out.println("You're ID number? ");
        String idNumber = scanner.next();
        scanner.nextLine();

        // nextLine
        // string
        System.out.println("You're name? ");
        String name = scanner.nextLine();

        // nextInt()
        // int
        System.out.println("You're age? ");
        int age = scanner.nextInt();

        // nextDouble()
        // double
        System.out.println("You're GPA? ");
        double GPA = scanner.nextDouble();

        // nextFloat()
        // float
        System.out.println("You're height? ");
        float height = scanner.nextFloat();

        // nextBoolean()
        // boolean
        System.out.println("You're married? ");
        boolean married = scanner.nextBoolean();

        // nextLong()
        // long
        System.out.println("You're target salary? ");
        long salary = scanner.nextLong();


        System.out.println(
            "ID Number: " + idNumber +
            "\nName\t : " + name +
            "\nAge\t : " + age +
            "\nGPA\t : " + GPA +
            "\nHeight\t : " + height +
            "\nMarried\t : " + married +
            "\nSalary\t : " + salary
        );

        scanner.close();
    }
    
}
