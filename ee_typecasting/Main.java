package ee_typecasting;

public class Main {

    public static void main(String[] args) {

        /* 
        Type Casting adalah convert tipe data primitive ke tipe data yang lain
        Ada 2 tipe casting di Java:
        Widening Casting (otomatis)
            cenvert tipe data dari tipe kecil ke tipe data yang lebih besar
            urutan ukuran kecil ke besar
            byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manual)
            convert tipe data yang besar ke ukuran yang lebih kecil
            urutang dari yang besar ke yang kecil
            double -> float -> long -> int -> char -> short -> byte
        */

        char myChar = 'A';
        byte myByte = 100;
        short myShort = 32000;
        int myInt = 1000000;
        long myLong = 1000000000L;
        float myFloat = 9.1234567f;
        double myDouble = 8.12345678123456;

        // WIDENING CASTING

        // byte ke short
        short byteToShort = myByte;
        System.out.println(byteToShort); // 100

        // short ke int
        int shortToInt = myShort;
        System.out.println(shortToInt); // 32000

        // int ke long
        long intToLong = myInt;
        System.out.println(intToLong); // 1000000

        // long ke float
        float longToFloat = myLong;
        System.out.println(longToFloat); // 1.0E9

        // float ke double
        double floatToDouble = myFloat;
        System.out.println(floatToDouble); // 9.123456954956055

        
        // NARROWING CASTING
        // double ke int
        int doubleToInt = (int) myDouble; // manual casting
        System.out.println(doubleToInt); // 8

        // short ke byte
        byte shortToByte = (byte) myShort; // manual
        System.out.println(shortToByte); // 0


    }
    
}
