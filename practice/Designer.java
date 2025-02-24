package practice;

public class Designer extends Employee {

    String tool;

    Designer(String name, String position, String tool) {
        super(name, position);
        this.tool = tool;
    }

    void setToolSkill(String tool) {
        this.tool = tool;
    }

    String getTool() {
        return this.tool;
    }

    public double bonus() {
        return 3.000;
    }
    
}
