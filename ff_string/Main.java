package ff_string;

public class Main {

    public static void main(String[] args) {
        /*
         * String
         * Digunakan untuk menyimpan teks
         * 
         * String dalam Java sebenarnya adalah objek, yang memiliki method untuk melakukan operasi tertentu
         * Misalnya
         * length()
         * indexOf()
         * join()
         * charAt()
         * equals()
         * replace()
         * split()
         * toLowerCase()
         * toUpperCase()
         * dll
         */

         String username = "Gunawan Efendi";
         System.out.println(username.toLowerCase());
         System.out.println(username.toUpperCase());
         System.out.println(username.length());
         System.out.println(username.isEmpty());

         String[] splittedUsername = username.split(" ");
         for(String name : splittedUsername) {
            System.out.println(name);
         }
         
    }
    
}
