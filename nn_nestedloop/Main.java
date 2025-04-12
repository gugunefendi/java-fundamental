package nn_nestedloop;

public class Main {

    public static void main(String[] args) {
        /*
         * Nested Loop
         * Nested loop atau loop bersarang atau loop didalam loop
         * Loop dalam akan dieksekusi satu kali untuk setiap iterasi loop luar
         */

         // loop luar
         for (int i = 1; i <= 2; i++) {
            System.out.println("Outer loop: " + i);

            // loop dalam
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j);
            }
         }
    }
    
}
