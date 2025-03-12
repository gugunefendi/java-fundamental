package basic.wrapper_class;

public class Main {

    public static void main(String[] args) {
        /*
         * Wrapper Class =  provides a way to use primitive data types as reference data types
         *                  reference data types contain useful methods
         *                  can be used with collections (ex.ArrayList) 
         */

        /*
         * Primitive    Reference
         * ---------    ---------
         * boolean      Boolean
         * char         Character
         * int          Integer
         * double       Double 
         */

         /*
          * Aoutoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
          * Unboxing    = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
          */

          Boolean a = true;
          Integer b = 123;
          Double c = 3.14;
          String d = "Hello Java";
          Character e = 'A';

          System.out.println(a.booleanValue()); // use method from reference type
          System.out.println(b.equals(123));
          System.out.println(c.doubleValue());
          System.out.println(d.toString());
          System.out.println(e.getClass());


          /*
           * Make to easy Wrapper Class
           * Wrapper class in Java is Class that use to change data type primitive to Object.
           * Java provides Wrapper Class to every data type primitive, so it can use in context that require objects (ex.List, Set, Map)
           * 
           * Why we need Wrapper Class?
           * 1. Collection like ArrayList<Integer> can not use primitive type (int), so we need Wrapper Class (Integer)
           * 2. Generic only supported object type, not a primitive
           * 3. Can use method (ex. Integer("123")) this is will convert from string to int
           */

           // Using Wapper Class
           // 1. Change Primitive to Object (Boxing)
           int number = 100;
           Integer objNumber = Integer.valueOf(number); // Boxing (manual)
           Integer objNumberTwo = number; // Auto-boxing
           System.out.println(objNumber + objNumberTwo);

           // 2. Change Object to Primitive
           Integer score = Integer.valueOf(100);
           int boxingScore = score.intValue(); // boxing manual
           int boxingScoreTwo = score; // auto-boxing
           System.out.println(boxingScore + " " + boxingScoreTwo); 

           // 3. Use method in Wrapper Class
            String numberString = "100";
            int numberInt = Integer.parseInt(numberString); // Change string to number
            double decimal = Double.parseDouble("3.14"); // Change string to double
            System.out.println(numberInt + " " + decimal);



    }
    
}
