package oo_foreach;

public class Main {

    public static void main(String[] args) {
        /*
         * Foreach loop digunakan secara eksklusif untuk melakukan loop melalui elemen-elemen dalam array (atau set data lainnya)
         * Sintaksis
         * for (type variableName : arrayName) {
         *  // kode blok untuk di eksekusi
         * }
         */

         String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

         for (String i : cars) {
            System.out.println(i);
         }

         // latihan
         int[] myNumbers = {1, 2, 3, 4, 5};

         for (int i : myNumbers) {
            System.out.println(i);
         }
    }
    
}
