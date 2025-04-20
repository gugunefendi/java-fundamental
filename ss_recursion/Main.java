package ss_recursion;

public class Main {

    public static void main(String[] args) {
        /*
         * Rekursi adalah fungsi yang memanggil dirinya sendiri
         * Teknik ini menyediakan cara untuk memecah masalah rumit menjadi masalah sederhana yang mudah dipecahkan
         */

         // contoh rekursi:
         int result = sum(10);
         System.out.println(result);

        // hasil dari method sum(parameter) adalah 55, kenapa 55? (penjelasan didalam method sum())

        // catatan penting!
        /*
         * sama sepertiu loop yang dapat memiliki loop tak terbatas
         * fungsi rekursif juga dapat dapat mengalami masalah rekursif tak terbatas
         * MAKANYA harus ada kondisi penghentian
         * yaitu kondisi saat fungsi behenti memanggil dirinya sendiri
         * dalam contoh method sum() kondisi berhentinya adalah jika value yang di kirimkan tidak lebih dari 0
         */

         /*
          * Latihan recursion
          */

          int calcFactorial = factorial(3);
          System.out.println(calcFactorial);

          int calcFibbonaci = fibbonaci(6);
          System.out.println(calcFibbonaci);

    }

    static int sum(int k) {
        if( k > 0) {
            return k + sum(k - 1); // eksekusi pertama 10 + (9)
            // kedua 9 + 8
            // ketiga 8 + 7
            // dan seterusnya hingga hasilnya 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 55
        } else {
            return 0;
        }
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    static int fibbonaci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibbonaci(n - 1) + fibbonaci(n - 2);
        }
    }
    
}
