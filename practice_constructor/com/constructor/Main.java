package practice_constructor.com.constructor;

public class Main {

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Merah");
        Mobil mobil2 = new Mobil("Honda", "Hitam");

        // akses langsung ke attribute
        System.out.println(mobil1.merek);
        System.out.println(mobil1.warna);

    }
    
}
