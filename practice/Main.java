package practice;

public class Main {

    public static void main(String[] args) {

        // create object Employee
        Employee employee1 = new Employee();
        employee1.setName("Gunawan Efendi");
        employee1.setPosition("Java Developer");
        employee1.setSalary(180.000);

        Employee employee2 = new Employee();
        employee2.setName("Muhammad Ridho");
        employee2.setPosition("C++ Developer");
        employee2.setSalary(200.000);
        

        // get properties
        String employee1Name = employee1.getName();
        String employee1Position = employee1.getPosition();
        double employee1Salary = employee1.getSalary();

        String employee2Name = employee2.getName();
        String employee2Position = employee2.getPosition();
        double employee2Salary = employee2.getSalary();

        // show result
        System.out.println("Employee Name\t\t: " + employee1Name);
        System.out.println("Employee Position\t: " + employee1Position);
        System.out.println("Employee Salary\t\t: " + "$" + employee1Salary + " /year");

        System.out.println("\nEmployee Name\t\t: " + employee2Name);
        System.out.println("Employee Position\t: " + employee2Position);
        System.out.println("Employee Salary\t\t: " + "$" + employee2Salary + " /year");
    }
    
}
