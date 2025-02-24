package practice;

public class Main {

    public static void main(String[] args) {

        // create object Employee
        Programmer programmer = new Programmer("Gunawan Efendi", "Programmer", "Java");

        Designer designer = new Designer("Muhammad Ridho", "Designer", "Photoshop");
        
        // get properties
        String programmerName = programmer.getName();
        String programmerPosition = programmer.getPosition();
        String programmerProgrammingLanguage = programmer.getProgrammingLanguage();
        double programmerBonus = programmer.bonus();
        
        String designerName = designer.getName();
        String designerPosition = designer.getPosition();
        String designerTool = designer.getTool();
        double designerBonus = designer.bonus();

        // show result
        System.out.println("Employee Name\t\t: " + programmerName);
        System.out.println("Employee Position\t: " + programmerPosition);
        System.out.println("Employee Skill\t\t: " + programmerProgrammingLanguage);
        System.out.println("Employee Bonus\t\t: " + programmerBonus);

        System.out.println("\nEmployee Name\t\t: " + designerName);
        System.out.println("Employee Position\t: " + designerPosition);
        System.out.println("Employee Skill\t\t: " + designerTool);
        System.out.println("Employee Bonus\t\t: " + designerBonus);

    }
    
}
