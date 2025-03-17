package basic.printf;

public class Main {

    public static void main(String[] args) {
        /*
         * printf()   = an optional method to control, format, and display text to the console window
         *              two arguments = format string + (object / variable / value)
         *              % [flags] [precision] [width] [conversion-character] 
         */

         boolean myBoolean = true;
         char myChar = '@';
         int myInt = 123;
         String myString = "Gunawan";
         double myDouble = 1000;

         // [conversion-character]
         System.out.printf("%b", myBoolean);
         System.out.printf("%c", myChar);
         System.out.printf("%d", myInt);
         System.out.printf("%s", myString);
         System.out.printf("%f", myDouble);
         System.out.println();

         // [width]
         // minimum number of characters to be written as output
         System.out.printf("Hello %10s %n", myString); // %n is new line
         System.out.printf("Hello %-10s %n", myString);

         // [precision]
         // sets number of digits of precision when outputting floating poin values
         System.out.printf("You have this much money %.2f %n", myDouble);

         /*
          * [flags]
          * adds an effect to output based on the flag added to format specifier
          * - = left justify
          * + = output a plus (+) or minus (-) sign for a numeric value
          * 0 = numeric values are zero-padded
          * , = comma grouping separator if number > 1000
          */

        System.out.printf("You have this much money %f %n", myDouble);
        System.out.printf("You have this much money %.2f %n", myDouble);
        System.out.printf("You have this much money %-20f %n", myDouble);
        System.out.printf("You have this much money %20f %n", myDouble);
        System.out.printf("You have this much money %+f %n", myDouble);
        System.out.printf("You have this much money %020f %n", myDouble);
        System.out.printf("You have this much money %,f %n", myDouble);



    }
    
}
