// latihan ngerjain soal logika dari https://www.duniailkom.com/kumpulan-contoh-kode-program-dan-latihan-algoritma-java/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInput;

        System.out.println("Masukkan jumlah persegi: ");
        numberInput = input.nextInt();

        String star = "*";

        for (int i = 0; i < numberInput; i++) {
            System.out.println(star.repeat(numberInput));
        }

        System.out.println("Masukkan tinggi persegi: ");
        int angkaTinggi = input.nextInt();

        System.out.println("Masukkan panjang persegi: ");
        int angkaPanjang = input.nextInt();

        for (int i = 0; i < angkaTinggi; i++) {
            System.out.println(star.repeat(angkaPanjang));
        }

        System.out.println("Masukkan angka tinggi segitiga: ");
        int angkaSegitiga = input.nextInt();

        for (int i = 0; i < angkaSegitiga; i++) {
            System.out.println(star + star.repeat(i));
        }

        System.out.println("Masukkan angka tinggi segitiga terbalik: ");
        int angkaSegitigaTerbalik = input.nextInt();

        // menggunakan for
        for (int i = angkaSegitigaTerbalik; i >= 1; i--) {
            System.out.println(star.repeat(i));
        }

        // menggunakan while
        while(angkaSegitigaTerbalik >= 1) {
            System.out.println(star.repeat(angkaSegitigaTerbalik));
            angkaSegitigaTerbalik--;
        }

        input.close();        
        
    }
}
