package ii_ifelse;

public class Main {

    public static void main(String[] args) {
        /* 
        if statement
        syntax:
        if (condition) {
        // code block
        }
        */

        int age = 19;

        if(age >= 75) {
            System.out.println("OK Boomer");
        }
        else if(age >= 18) {
            System.out.println("You are an adult");
        }
        else if(age >= 13) {
            System.out.println("You are not teenager");
        }
        else {
            System.out.println("You are not an adult");
        }


    }
    
}
