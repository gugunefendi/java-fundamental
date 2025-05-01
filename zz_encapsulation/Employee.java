package zz_encapsulation;

public class Employee {

    private String name; // identifier atribut private

    // constructo
    Employee(String name) {
        this.setName(name); // ketika inisialisasi object langsung panggil method setName
    }

    // memberikan nilai ke atribute name
    private void setName(String name) {
        this.name = name;
    }

    // mengambil data atribut
    public String getName() {
        return this.name;
    }
    
}
