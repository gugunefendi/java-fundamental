package basic.random_numbers;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        
        int randomInt = random.nextInt(5)+1; // bound 5 is maximal number + 1 is number start from 1
        double randomDouble = random.nextDouble();
        boolean randomBoolean = random.nextBoolean();

        System.out.println("Random Integer\t : " + randomInt);
        System.out.println("Random Double\t : " + randomDouble);
        System.out.println("Random Boolean\t : " + randomBoolean);
    }
    
}
