package basic.method;

public class Main {

    public static void main(String[] args) {
        hello();

        int x = 4;
        int y = 3;
        int z = add(x, y);
        System.out.println(z);
    }

    static void hello() {
        System.out.println("Hello World");
    }

    static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    
}
