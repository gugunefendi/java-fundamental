package basic.for_loop;

public class Main {

    public static void main(String[] args) {
        // for loop = execute a block of code a limited amount of times
        
        // increment
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // decrement
        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // increment multiple
        for(int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }

        // decrement multiple
        for(int i = 10; i >= 0; i-=2) {
            System.out.println(i);
        }
    }
    
}
