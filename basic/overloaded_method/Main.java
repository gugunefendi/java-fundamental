package basic.overloaded_method;

public class Main {

    public static void main(String[] args) {

        /*
         * Overloaded methods = methods that share the same name but have different paramters
         *                      method name + parameters = method signature
         */

        int twoArgument = add(1, 2); // will call method add which accepts 2 parameters
        System.out.println(twoArgument);

        int threeArgument = add(1, 2, 3); // will call method add which accepts 3 parameters
        System.out.println(threeArgument);

        int fourArgument = add(1, 2, 3, 4); // will call method add which accepts 4 parameters
        System.out.println(fourArgument);

    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
    
}
