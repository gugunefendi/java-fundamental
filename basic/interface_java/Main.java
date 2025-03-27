package basic.interface_java;

public class Main {

    public static void main(String[] args) {

        /*
         * Inteface =   a template that can be applied to a class.
         *              similliar to inheritance, but specifies what a class has/must do.
         *              classes can be apply more than one interface, inheritance is limited to 1 super class    
         */

         Rabbit rabbit = new Rabbit();
         rabbit.flee();

         Hawk hawk = new Hawk();
         hawk.hunt();
        
         // fish has implements 2 interface
         Fish fish = new Fish();
         fish.flee(); // from preyinterface
         fish.hunt(); // from predatoreinterface

    }
    
}
