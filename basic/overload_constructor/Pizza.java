package basic.overload_constructor;

public class Pizza {

    String bread;
    String cheese;
    String sauce;
    String topping;

    Pizza() {

    }

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza(String bread, String cheese) {
        this.bread = bread;
        this.cheese = cheese;
    }

    Pizza(String bread, String cheese, String sauce) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
    }

    Pizza(String bread, String cheese, String sauce, String topping) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
        this.topping = topping;
    }
    
}
