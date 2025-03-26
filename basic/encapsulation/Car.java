package basic.encapsulation;

public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    private void setMake(String make) {
        this.make = make;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setYear(int year) {
        this.year = year;
    }
    
}
