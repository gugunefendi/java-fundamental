package basic.overload_constructor;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        System.out.println("Here are the ingredients of your Pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
        System.out.println("=====================");

        Pizza pizza1 = new Pizza("Thicc Crust", "Tomato", "Mozzarella", "Pepperoni");

        System.out.println("Here are the ingredients of your Pizza: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.topping);
        System.out.println("=====================");

        Pizza pizza2 = new Pizza("Thicc Crust", "Tomato", "Mozzarella");

        System.out.println("Here are the ingredients of your Pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.topping);
        System.out.println("=====================");

        Pizza pizza3 = new Pizza("Thicc Crust", "Tomato");

        System.out.println("Here are the ingredients of your Pizza: ");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.cheese);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.topping);
        System.out.println("=====================");

        Pizza pizza4 = new Pizza("Thicc Crust");

        System.out.println("Here are the ingredients of your Pizza: ");
        System.out.println(pizza4.bread);
        System.out.println(pizza4.cheese);
        System.out.println(pizza4.sauce);
        System.out.println(pizza4.topping);
        System.out.println("=====================");
    }

}
