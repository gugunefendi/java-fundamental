package basic.access_modifiers.protected_modifier;

import basic.access_modifiers.package1.Salary;

public class Main {

    public static void main(String[] args) {

        // name is protected can access from same class and subclass
        A a = new A("Gunawan");
        System.out.println(a.name);

        // access name which is name is protected from sub class
        B b = new B("Efendi");
        b.displayName();
        
        // code below will error because extratime is from another package and modifier is protected
        // System.out.println(Salary.extraTime);

        // can show extra time from Salary altough is protected, because C extends Salary
        C c = new C();
        c.displayExtraTime();

    }

}