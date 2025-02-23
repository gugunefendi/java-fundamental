package practice2_interface;

public class Motor implements KendaraanInterface {

    boolean mesinNyala;
    boolean mesinMati;

    public void nyalakanMesin() {
        System.out.println("Mesin menyala");
    }

    public void matikanMesin() {
        System.out.println("Mesin mati");
    }
    
}
