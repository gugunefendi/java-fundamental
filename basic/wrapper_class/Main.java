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
    }
    
}
