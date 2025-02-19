class Mobil implements IMobil {

    String merek;
    String warna;
    int kecepatanSaatIni;
    int bahanBakar;

    Mobil(String merek, String warna, int kecepatanSaatIni, int bahanBakar) {
        this.merek = merek;
        this.warna = warna;
        this.kecepatanSaatIni = kecepatanSaatIni;
        this.bahanBakar = bahanBakar;
    }

    public void ubahMerek(String merek) {
        this.merek = merek;
    }

    public void ubahWarna(String warna) {
        this.warna = warna;
    }

    public void tambahKecepatan(int kecepatan) {
        this.kecepatanSaatIni += kecepatan;
    }

    public void tambahBahanBakar(int bahanBakar) {
        this.bahanBakar += bahanBakar;
    }

    public void showMobil() {
        System.out.println(
            "Merek\t: " + this.merek + "\n" + 
            "Warna\t: " + this.warna +  "\n" +
            "Kecepatan saat ini\t: " + this.kecepatanSaatIni + "\n" +
            "Bahan bakar\t: " + this.bahanBakar
            );
    }

}