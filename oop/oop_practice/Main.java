// package
package oop.oop_practice;

// class utama
public class Main {

    // method utama
    public static void main(String[] args) {
        
        // create object employee
        Employee employee1 = new Employee("Gunawan Efendi");
        employee1.displayEmployee();
        
        String employeeName = employee1.getName();
        System.out.println("Employee Name\t: " + employeeName);

        employee1.changeName("Jhon Doe");
        System.out.println("Employee Name\t: " + employee1.getName());

        String greetingToEmployee = employee1.greeting("Good morning ");
        System.out.println(greetingToEmployee);
    }
}
