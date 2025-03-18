package basic.constructor;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Gunawan", 33, 60.5);
        Human human2 = new Human("Budi", 55, 80.5);
        
        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.drink();
    }
    
}
