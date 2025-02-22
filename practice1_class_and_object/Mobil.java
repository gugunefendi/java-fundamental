package practice1_class_and_object;

public class Mobil {

    String merk;
    int tahun;
    int kecepatan = 0;

    public void tampilInfo() {
        System.out.println("Merk mobil : " + this.merk + "\nTahun : " + this.tahun + "\nKecepatan : " + this.kecepatan);
    }

    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
    }

    public void kurangiKecepatan(int kecepatan) {
        this.kecepatan -= kecepatan;
    }
    
}
