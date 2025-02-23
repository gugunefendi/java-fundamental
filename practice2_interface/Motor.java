package practice2_interface;

public class Motor implements KendaraanInterface {

    boolean mesinNyala;
    boolean mesinMati;

    public void nyalakanMesin(boolean mesinMenyala) {
        this.mesinNyala = mesinMenyala;
    }

    public void matikanMesin(boolean mesinMati) {
        this.mesinMati = mesinMati;
    }

    public String apakahMotorMenyala() {

        if (this.mesinNyala) {
            return "Ya";
        } else {
            return "Tidak";
        }

    }

    public String apakahMotorMati() {

        if (this.mesinMati) {
            return "Ya";
        } else {
            return "Tidak";
        }
        
    }
    
}
