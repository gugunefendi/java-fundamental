package practice2_interface;

public class Main {
    
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.nyalakanMesin(true);
        motor1.matikanMesin(false);

        String mesinMenyala = motor1.apakahMotorMenyala();
        System.out.println("Mesin Menyala\t: " + mesinMenyala);

        String mesinMati = motor1.apakahMotorMati();
        System.out.println("Mesin Mati\t: " + mesinMati);
    }

}
