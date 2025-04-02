package cc_operator;

public class Main {

    public static void main(String[] args) {
        /*
         * OPERATORS
         * Operator adalah simbol khusus yang melakukan operasi tertentu pada satu, dua atau tiga operan 
         * lalu mengembalikkan hasil.
         * 
         * Operator berikut ini diurutkan menurut urutan prioritas
         * 
         * Operator Precedence / Prioritas Operator
         * 
         * Operator                 Precedence
         * postfix                  expr++ expr--
         * unary                    ++expr --expr +expr -expr
         * multipicative            * / %
         * additive                 + -
         * shift                    << >> >>>
         * relational               < > <= >= instanceof
         * equality                 == !=
         * bitwise AND              &
         * bitwise exclusive OR     ^
         * bitwise inclusice OR     |
         * logical AND              &&
         * logical OR               ||
         * ternary                  ? :
         * assignment               = += -= *= /= %= &= ^= |= <<= >>= >>>=
         * 
         */

         /*
          * Aritmethic Operators
          +     Additive operator (juga digunakan untuk menggabungkan sebuah string)
          -     Subtraction
          *     Multiplication
          /     Division
          %     Remainder / Modulus
          */

          int numberOne = 100;
          int numberTwo = 50;
          int addition = numberOne + numberTwo;
          int subtraction = numberOne - numberTwo;
          int multiplication = numberOne * numberTwo;
          int division = numberOne / numberTwo;
          int modulus = numberOne % numberTwo;
          System.out.println("Addition\t :" + addition);
          System.out.println("Subtraction\t :" + subtraction);
          System.out.println("multiplication\t :" + multiplication);
          System.out.println("Division\t :" + division);
          System.out.println("Modulus\t\t :" + modulus);


    }
    
}
