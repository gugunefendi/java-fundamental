package basic.variables;

public class Main {
    
    public static void main(String[] args) {

        // int x; declaration
        // x = 123; assignment
        // int x = 123; initialization

        /*
         * Data Type    Size        primitive/reference     value
         * boolean      1 bit       primitive               true or false
         * byte         1 byte      primitive               -128 to 127
         * short        2 bytes     primitive               -32.768 to 32.767
         * int          4 bytes     primitive               -2 billion to 2 billion
         * long         8 bytes     primitive               -9 quintillion to 9 quintillion
         * float        4 bytes     primitive               fractional number up to 6-7 digits, ex. 3.141592f
         * double       8 bytes     primitive               fractional number up to 15 digits, ex. 3.413498756784323
         * char         2 bytes     primitive               single character / letter / ASCII, ex. 'f'
         * string       varies      reference               a sequence of characters, ex. "Hello World"
         */

        /*
         * Primitive                    VS  Reference
         * 8 types (boolean, byte, etc)     unlimited (user defined)
         * stores data                      stores and address
         * can only hold 1 value            could hold more than 1 value
         * less memory                      more memory
         * fast                             slower
         */

        int myInteger = 123; // int
        long myLong = 23232878765656655L; // long
        byte myByte = 100; // byte
        float myFloat = 3.14f; // float
        short myShort = 30000; // short
        double myDouble = 3.14; //double
        boolean myBoolean = true; // boolean
        char mySymbol = '@'; // char
        String myString = "Gunawan Efendi"; // string
        

        System.out.println("Integer\t : " + myInteger);
        System.out.println("Long\t : " + myLong);
        System.out.println("Byte\t : " + myByte);
        System.out.println("Float\t : " + myFloat);
        System.out.println("Short\t : " + myShort);
        System.out.println("Double\t : " + myDouble);
        System.out.println("Boolean\t : " + myBoolean);
        System.out.println("Symbol\t : " + mySymbol);
        System.out.println("String\t : " + myString);

        // REFERENCE VARIABLE
        System.out.println("\nSWAP TWO VARIABLES");
        String shirtsBasket = "Shirt";
        String pantsBasket = "Pants";

        System.out.println("Red basket\t : " + shirtsBasket);
        System.out.println("Blue basket\t : " + pantsBasket);

        String temp;
        temp = shirtsBasket;
        shirtsBasket = pantsBasket;
        pantsBasket = temp;

        System.out.println("Red basket\t : " + shirtsBasket);
        System.out.println("Blue basket\t : " + pantsBasket);

        // CHANGE VALUE IN REFERENCE
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;

        arr2[0] = 99; // change arr2 have change arr1 to
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

    }

}
