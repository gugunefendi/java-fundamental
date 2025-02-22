package practice_method;

public class Mobil {

    String merek;
    String warna;

    Mobil(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    public static void methodStatic() {
        System.out.println("Test method static");
    }

    // method tanpa return dan tanpa parameter
    void welcome() {
        System.out.println("Selamat datanya di Object Mobil");
    }

    // method tanpa return dan dengan parameter
    void setMerek(String merek) {
        this.merek = merek;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    // method dengan return tanpa parameter
    String getMerek() {
        return this.merek;
    }

    String getWarna() {
        return this.warna;
    }

    // method dengan return dan dengan paramter
    String displayMobil(String message) {
        return message + "dengan merek : " + this.merek + "warnanya adalah : " + this.warna;
    }


    
}
