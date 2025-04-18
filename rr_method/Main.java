package rr_method;

public class Main {

    public static void main(String[] args) {

        // METHOD
        
        // Panggil method
        greeting("Gunawan");

        // call method that return a string value
        System.out.println(displayName("Gunawan Efendi"));

        // method overloading
        int calcInteger = addInteger(10, 20);
        System.out.println(calcInteger);

        float calcFloat = addFloat(12.5f, 12.6f);
        System.out.println(calcFloat);

        double calcDouble = addDouble(10.500000000000, 10.500000000000, 10.500000000000);
        System.out.println(calcDouble);

        // method scope
        displayAge("Gunawan");


    }

    // membuat method
    // menggunakan keyword static artinya method ini dimiliki oleh class Main bukan Object Main
    static void greeting(String name) {
        System.out.println("Hello " + name);
    }

    // method return value
    static String displayName(String name) {
        return name + " is a Java Developer";
    }

    // METHOD OVERLOADING
    /*
     * with method overloading we can use many methods with same name but different parameter
     * example:
     * int myMethod(int x)
     * float myMethod(float x)
     * double myMethod(double x, double y)
     * 
     * you can see example above, we have 3 method with same name but we can use different parameter
     */

     static int addInteger(int x, int y) {
        return x + y;
     }

     static float addFloat(float x, float y) {
        return x + y;
     }

     static double addDouble(double x, double y, double z) {
        return (x + y) + z;
     }

     /*
      * METHOD SCOPE

      variabel yang di deklarasikan didalam sebuah blok kode
      hanya dapat diakses dari dalam blok kode tersebut
      */

      static void displayAge(String name) {
        if (name == "Gunawan") {
            int age = 30;
            System.out.println("You are " + age + " years old");
        } else {
            // kamu tidak bisa menggunakan variabek age disini
            // System.out.println(age + "Unknown"); // Ini akan eror
            System.out.println("Unknown");
        }

        // kamu juga tidak bisa menggunakan variabel age disini
        // System.out.println(age + "Unknown"); // Ini akan eror

      }
    
}
