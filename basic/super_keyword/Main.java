package basic.super_keyword;

public class Main {

    /*
     * super    =   keyword refers to the superclass (parent) of an object
     *              very similar to the "this" keyword
     */

    public static void main(String[] args) {

        Hero hero1 = new Hero("Batman", 45, "High");
        Hero hero2 = new Hero("Superman", 40, "Low");

        System.out.println(hero2.toString());

    }
    
}
