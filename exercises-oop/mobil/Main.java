public class Main {
    
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Merah", 1200, 80);
        mobil1.showMobil();
        mobil1.ubahMerek("Honda");
        mobil1.ubahWarna("Biru");
        mobil1.tambahKecepatan(20);
        mobil1.tambahBahanBakar(10);
        mobil1.showMobil();
    }

}
