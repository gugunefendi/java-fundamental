package basic.expression;

public class Main {

    public static void main(String[] args) {
        // expression = operand & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %
        
        // aritmathic expression
        int x = 6;
        int y = 4;
        int result;

        result = x + y;
        System.out.println(x + " + " + y + " : " + result);

        result = x - y;
        System.out.println(x + " - " + y + " : " + result);

        // type casting
        double doubleResult = (double) x / y;
        System.out.println(x + " / " + y + " : " + doubleResult);
        
        result = x * y;
        System.out.println(x + " * " + y + " : " + result);

        result = x % y;
        System.out.println(x + " % " + y + " : " + result);

    }
    
}
