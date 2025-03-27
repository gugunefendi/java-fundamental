package basic.interface_java;

public class Fish implements PredatorInterface, PreyInterface {

    @Override
    public void flee() {
        System.out.println("This fish is fleeing from bigger fish");
    }

    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }
    
    

}
