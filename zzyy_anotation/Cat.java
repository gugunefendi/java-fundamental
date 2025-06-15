package zzyy_anotation;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meoww");
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }
}
