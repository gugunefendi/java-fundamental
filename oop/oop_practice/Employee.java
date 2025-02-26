package oop.oop_practice;

public class Employee {
    
    // properties
    String name;

    // constructor
    Employee(String name) {
        this.name = name;
    }

    // methhod no return and no parameter
    void displayEmployee() {
        System.out.println("Employee Name\t: " + this.name);
    }

    // method return and no parameter
    String getName() {
        return this.name;
    }

    // method no return with parameter
    void changeName(String newName) {
        this.name = newName;
    }

    String greeting(String words) {
        return words + this.name;
    }

}
