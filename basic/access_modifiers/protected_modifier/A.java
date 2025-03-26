package basic.access_modifiers.protected_modifier;

import basic.access_modifiers.package1.Salary;

public class A {

    protected String name;

    A(String name) {
        this.name = name;
    }

    // will error to, becuse extratime is from another package and modifier is protected
    // void displayExtraTime() {
    //     System.out.println(Salary.extraTime);
    // }
    
}
