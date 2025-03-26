package basic.access_modifiers.protected_modifier;

public class B extends A {
    
    B(String name) {
        super(name);
    }

    void displayName() {
        System.out.println("Name : " + this.name);
    }

    
}
