package practice;

public class Main {

    public static void main(String[] args) {

        // create object Employee
        Employee employee1 = new Employee("Gunawan Efendi", "Java Developer", 180.000);

        Employee employee2 = new Employee("Muhammad Ridho", "C++ Developer", 200.000);
        
        // set skill and foreign language
        employee1.setSkill("Java");
        employee1.setForeignLanguage("English");

        employee2.setSkill("C++");
        employee2.setForeignLanguage("Chinese");

        // get properties
        String employee1Name = employee1.getName();
        String employee1Position = employee1.getPosition();
        double employee1Salary = employee1.getSalary();
        String employee1Skill = employee1.getSkill();
        String employee1ForeignLanguage = employee1.getForeignLanguage();

        String employee2Name = employee2.getName();
        String employee2Position = employee2.getPosition();
        double employee2Salary = employee2.getSalary();
        String employee2Skill = employee2.getSkill();
        String employee2ForeignLanguage = employee2.getForeignLanguage();

        // show result
        System.out.println("Employee Name\t\t: " + employee1Name);
        System.out.println("Employee Position\t: " + employee1Position);
        System.out.println("Employee Salary\t\t: " + "$" + employee1Salary + " /year");
        System.out.println("Employee Skill\t\t: " + employee1Skill);
        System.out.println("Employee FLP\t\t: " + employee1ForeignLanguage);

        System.out.println("\nEmployee Name\t\t: " + employee2Name);
        System.out.println("Employee Position\t: " + employee2Position);
        System.out.println("Employee Salary\t\t: " + "$" + employee2Salary + " /year");
        System.out.println("Employee Skill\t\t: " + employee2Skill);
        System.out.println("Employee FLP\t\t: " + employee2ForeignLanguage);
    }
    
}
