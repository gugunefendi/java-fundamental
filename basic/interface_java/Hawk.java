package basic.interface_java;

public class Hawk implements PredatorInterface {

    @Override
    public void hunt() {
        System.out.println("The hawk is hunting");
    }
    
}
