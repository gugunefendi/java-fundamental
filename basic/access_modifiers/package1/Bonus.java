package basic.access_modifiers.package1;

public class Bonus extends Salary {
    
    public float bonusInJanuary = 5000;

    public String totalSalary() {
        return "Salary in January : " + this.salaryInJanuary + "\n" + "Bonus in January : " + this.bonusInJanuary;
    }

}
