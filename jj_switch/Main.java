package jj_switch;

public class Main {

    public static void main(String[] args) {
        /*
         * Daripada menulis banyak if else
         * Kamu bisa gunakan switch case
         * 
         * Sintaks Switch Case
         * switch(expression) {
         *  case x:
         *  // block code
         *  break;
         * case y:
         *  // block code
         *  break;
         * default:
         *  // block code
         * }
         * 
         * kata kunci break adalah untuk keluar dari loop jika ada kecocokan
         * kata kunci default akan di eksekusi jika tidak ada kecocokan
         * 
         */

         int day  = 5;
         switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No match day");
         }
    }
    
}
