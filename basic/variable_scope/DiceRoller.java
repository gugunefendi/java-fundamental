package basic.variable_scope;

import java.util.Random;

public class DiceRoller {

    // # GLOBAL SCOPE
    Random random;
    int number = 0;

    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

    // # LOCAL SCOPE
    // DiceRoller() {
    //     Random random = new Random();
    //     int number = 0;
    //     roll(random, number);
    // }

    // void roll(Random random, int number) {
    //     number = random.nextInt(6) + 1;
    //     System.out.println(number);
    // }
    
}
