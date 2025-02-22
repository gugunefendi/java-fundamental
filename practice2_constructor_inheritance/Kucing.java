package practice2_constructor_inheritance;

public class Kucing extends Hewan {

    String warnaBulu;

    Kucing(String nama, double berat, String warnaBulu) {
        super(nama, berat);
        this.warnaBulu = warnaBulu;
    }

    public void informasiKucing() {
        System.out.println("Nama : " + this.nama + "\nBerat : " + this.berat + "\nWarna bulu : " + this.warnaBulu);
    }
    
}
