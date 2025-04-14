package pp_breakcontinue;

public class Main {

    public static void main(String[] args) {
        // break digunakan untuk keluar dari suatu masalah
        // contoh 
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // jika i == 4 maka keluar dari loop
            }
            System.out.println(i);
        }

        // continue digunakan untuk melewati satu iterasi (dalam perulangan)
        // contoh
        for (int i = 0; i < 10; i++) {
            if (i == 5) { // jika i == 5
                continue; // lewati saja
            }
            System.out.println(i);
        }
    }
    
}
