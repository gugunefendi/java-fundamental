package rr_method;

public class Main {

    public static void main(String[] args) {

        // METHOD
        
        // Panggil method
        greeting("Gunawan");

        // call method that return a string value
        System.out.println(displayName("Gunawan Efendi"));


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
    
}
