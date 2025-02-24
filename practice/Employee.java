package practice;

public class Employee implements EmployeeInterface {

    // states
    String name;
    String position;

    Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // no return and have a parameter
    void setName(String name) {
        this.name = name;
    }

    // no return and and have a parameter
    void setPosition(String position) {
        this.position = position;
    }

    // no return and and have a parameter
    String getName() {
        return this.name;
    }

    // no return and and have a parameter
    String getPosition() {
        return this.position;
    }

    public double bonus() {
        return 10.000;
    }
    
}
