package basic.math_class;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double max = Math.max(x, y);
        System.out.println("Max\t: " + max);

        double min = Math.min(x, y);
        System.out.println("Min\t: " + min);

        double absolute = Math.abs(y);
        System.out.println("Absolute y\t: " + absolute);

        double round = Math.round(x);
        System.out.println("Round\t: " + round);


        // count hypotenuse
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x : ");
        double sidex = scanner.nextDouble();

        System.out.println("Input y : ");
        double sidey = scanner.nextDouble();

        /* formula
        c = sqrt(a^2 + b^2)
        sqrt = square root (akar kuadrat)
        */

        double resultHypotenuse = Math.sqrt((sidex * sidex) + (sidey * sidey));
        System.out.println("Result hypotenuse: " + resultHypotenuse);

        scanner.close();

    }
    
}
