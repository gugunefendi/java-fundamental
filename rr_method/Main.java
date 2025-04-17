package rr_method;

public class Main {

    public static void main(String[] args) {

        // METHOD
        
        // Panggil method
        greeting("Gunawan");


    }

    // membuat method
    // menggunakan keyword static artinya method ini dimiliki oleh class Main bukan Object Main
    static void greeting(String name) {
        System.out.println("Hello " + name);
    }
    
}
