package basic.access_modifiers.protected_modifier;

import basic.access_modifiers.package1.Salary;

public class C extends Salary {
    
    // can access extraTime altough is protected, becuse C extends Salary altough different package
    void displayExtraTime() {
        System.out.println("Extra time: " + this.extraTime);
    }

}
