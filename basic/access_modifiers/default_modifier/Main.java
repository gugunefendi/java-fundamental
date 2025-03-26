package basic.access_modifiers.default_modifier;

import basic.access_modifiers.package1.Salary;;

public class Main {

    public static void main(String[] args) {


        // greeting is default modifier, can accessed because in same package
        Hello hello = new Hello("I am Java Developer");
        System.out.println(hello.greeting);

        // can not access default message, because is from another package
        // System.out.println(Salary.defaultMessage);

    }
    
}
