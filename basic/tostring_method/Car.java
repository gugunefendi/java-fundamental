package basic.tostring_method;

public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2021;

    // if you are not creat toString method, so Car object will print memory address
    public String toString() {
        return this.make + "\n" + this.model + "\n" + this.color + "\n" + this.year; 
    }
    
}
