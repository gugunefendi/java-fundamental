package practice1_class_and_object;

public class Main {
    
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.tahun = 2022;
        mobil1.tampilInfo();
        mobil1.tambahKecepatan(20);
        mobil1.kurangiKecepatan(5);
        mobil1.tampilInfo();
    }

}
