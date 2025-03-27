package basic.interface_java;

public class Rabbit implements PreyInterface {

    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing from predator");
    }

    
}
