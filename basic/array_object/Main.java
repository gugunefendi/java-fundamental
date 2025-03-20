package basic.array_object;

public class Main {

    public static void main(String[] args) {

        // First way
        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hotdog");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

        // Second way
        Food food4 = new Food("Milk");
        Food food5 = new Food("Soda");
        Food food6 = new Food("Coffee");

        Food[] refrigerator2 = {food4, food5, food6};

        System.out.println(refrigerator2[0].name);
        System.out.println(refrigerator2[1].name);
        System.out.println(refrigerator2[2].name);

    }
    
}
