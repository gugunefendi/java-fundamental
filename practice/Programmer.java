package practice;

public class Programmer extends Employee {

    String programmingLanguage;

    Programmer(String name, String position, String programmingLanguage) {
        super(name, position);
        this.programmingLanguage = programmingLanguage;
    }

    void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    public double bonus() {
        return 5.000;
    }
    
}
