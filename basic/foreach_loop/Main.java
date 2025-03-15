package basic.foreach_loop;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        /*
         * for-each =   traversing technique to iterate through the elements in an array/collection
         *              less step
         *              less flexible
         */

         // array static
         String[] animals = {"Cat", "Dog", "Rat", "Bird"};

         for(String i : animals) {
            System.out.println(i);
         }

         // array dinamic
         ArrayList<String> phones = new ArrayList<String>();

         phones.add("Apple");
         phones.add("Nokia");
         phones.add("Samsung");

         for(String i : phones) {
            System.out.println(i);
         }
    }

}
