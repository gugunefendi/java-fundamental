package practice;

public class Employee implements EmployeeInterface {

    // states
    String name;
    String position;
    double salary;
    String skill;
    String foreignLanguage;

    Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
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
    void setSalary(double salary) {
        this.salary = salary;
    }

    // no return and and have a parameter
    String getName() {
        return this.name;
    }

    // no return and and have a parameter
    String getPosition() {
        return this.position;
    }

    // no return and and have a parameter
    double getSalary() {
        return this.salary;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return this.skill;
    }

    public void setForeignLanguage(String language) {
        this.foreignLanguage = language;
    }

    public String getForeignLanguage() {
        return this.foreignLanguage;
    }
    
}
