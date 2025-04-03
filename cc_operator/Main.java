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
          System.out.println("Addition\t : " + addition);
          System.out.println("Subtraction\t : " + subtraction);
          System.out.println("multiplication\t : " + multiplication);
          System.out.println("Division\t : " + division);
          System.out.println("Modulus\t\t : " + modulus);
          System.out.println();

          /*
           * Unary Operators
           * 
           * Operator   Description
           * +          Unary plus
           * -          Unary minus
           * ++         Increment
           * --         Decrement
           * !          Logical
           */

           // unary +
           int numberThree = +5; // tidak mengubah nilai hanya menegaskan bahwa nilainya positif
           System.out.println("Unary Plus\t : " + numberThree); // 5
           // unary -
           int numberFour = -5; // tidak mengubah nilai hanya menegaskan bahwa nilainya negatif
           System.out.println("Unary Minus\t : " + numberFour); // -5
           // increment
           int numberFive = 2;
           numberFive++;
           System.out.println("Increment\t : " + numberFive); // 3
           // decrement
           int numberSix = 7;
           numberSix--;
           System.out.println("Decrement\t : " + numberSix); // 6
           // logical
           System.out.println("Logical true\t : " + true);
           System.out.println("Logical false\t : " + !true);

           // EQUALITY and RELATIONAL
           // == != > >= < <=
           int value1 = 1;
           int value2 = 2;
           if(value1 == value2) {
            System.out.println("value1 == value2");
           }
           if(value1 != value2) {
            System.out.println("value1 != value2");
           }
           if(value1 > value2) {
            System.out.println("value1 > value2");
           }
           if(value1 >= value2) {
            System.out.println("value1 >= value2");
           }
           if(value1 < value2) {
            System.out.println("value1 < value2");
           }
           if(value1 <= value2) {
            System.out.println("value1 <= value2");
           }
           System.out.println();

           // CONDITIONAL
           int value3 = 1;
           int value4 = 2;
           if((value3 == 1) && (value4 == 2)) {
            System.out.println("value3 is 1 AND value4 is 2");
           }
           if((value3 == 1) || (value4 == 1)) {
            System.out.println("value3 is 1 OR value4 is 1");
           }

           // TENARY OPERATOR
           int value5 = 8;
           int value6 = 2;
           boolean someCondition = true;
           char result = value5 < value6 ? '<' : '>';
           System.out.printf("%d%c%d", value5, result, value6);
           System.out.println();

           // COMPARISON OPERATOR
           Parent obj1 = new Parent();
           Child obj2 = new Child();

           System.out.println("obj1 instance of Parent: " + (obj1 instanceof Parent));
           System.out.println("obj1 instance of Child: " + (obj1 instanceof Child));
           System.out.println("obj1 instance of MyInterface: " + (obj1 instanceof MyInterface));
           System.out.println("obj2 instance of Parent: " + (obj2 instanceof Parent));
           System.out.println("obj2 instance of Child: " + (obj2 instanceof Child));
           System.out.println("obj2 instance of MyInterface: " + (obj2 instanceof MyInterface));
           




    }
    
}
