package recap_oop;

public class Mobil {
    // state
    String merek;
    String warna;
    int kecepatanMaksimal;

    // constructor untuk inisialisasi ketika membuat object mobil
    Mobil(String merek, String warna, int kecepatan) {
        this.merek = merek;
        this.warna = warna;
        this.kecepatanMaksimal = kecepatan;
    }

    // method untuk menampilkan state
    public String displayMobil() {
        // pada kode ini bisa menggunakan this ataupun tidak
        // menggunakan this berati menegaskan bahwa variabel yang digunakan dari variabel instance dalam objek yang sedang digunakan
        // jika tidak menggunakan this kode tetap berfungsi selama tidak ada variabel lokal 
        // atau parameter dengan nilai yang sama
        return "Merek Mobil : " + this.merek + "\nWarna Mobil : " + this.warna;
    }
}
