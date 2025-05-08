package zzgg_enum;

public class Main {

    public static void main(String[] args) {
        /*
         * Enum (Enumerisasi)
         * Enum adalah class khusus yang mewakili sekelompok konstanta (variabel yang tidak dapat diubah, seperti final variabel)
         * 
         * Untuk membuat Enum gunakan keyword enum, dan pisahkan konstanta dengan koma.
         * contoh membuat enum:
         * enum Level {
         *  LOW,
         *  MEDIUM,
         *  HIGH
         * }
         * contoh akses enum:
         * Level level = Level.MEDIUM;
         * 
         * Enum merupakan singaktan dari Enumerations yang berarti terdaftar secara khusus.
         * 
         * Kita juga bisa membuat Enum didalam class
         * class Main {
         *  enum Level {
         *      LOW,
         *      MEDIUM,
         *      HIGH
         *  }
         *  public static void(String[] args) {
         *      Level level = Level.MEDIUM;
         *      System.out.println(level); // output MEDIUM
         *  }
         * }
         * 
         * Enum dalam swith
         * Level level = Level.MEDIUM;
         * switch(level) {
         *  case LOW:
         *  System.out.println("Low level");
         *  break;
         * 
         *  case MEDIUM:
         *  System.out.println("Medium level");
         *  break;
         * 
         *  case HIGH:
         *  System.out.println("High level");
         *  break;
         * }
         * 
         * Enum dalam loop
         * Tiap enum memiliki values(). Method yang menembalikkan array dari semua konstanta enum.
         * for (Level level: Level.values) {
         *  System.out.println(level);
         * }
         */

         // akses enum
         Level level = Level.MEDIUM;
         System.out.println(level);

         // swith enum
         Level levelTwo = Level.HIGH;
         switch (levelTwo) {
            case LOW:
                System.out.println("Low Level");
                break;

            case MEDIUM:
                System.out.println("Medium Level");
                break;

            case HIGH:
                System.out.println("High Level");
                break;
         
            default:
                break;
         }

         // loop values di dalam enum
         for(Level myLevel: Level.values()) {
            System.out.println(myLevel);
         }
    }
    
}
