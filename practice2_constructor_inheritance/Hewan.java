package practice2_constructor_inheritance;

public class Hewan {

    String nama;
    double berat;

    Hewan(String nama, double berat) {
        this.nama = nama;
        this.berat = berat;
    }

    public void makan(double jumlahMakanan) {
        this.berat += jumlahMakanan;
    }


}
