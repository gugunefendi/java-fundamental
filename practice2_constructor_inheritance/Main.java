package practice2_constructor_inheritance;

public class Main {

    public static void main(String[] arg) {
        Kucing kucing1 = new Kucing("Milo", 4.2, "Putih");    
        kucing1.informasiKucing();
        kucing1.makan(0.5);
        kucing1.informasiKucing();
    }
    
}
