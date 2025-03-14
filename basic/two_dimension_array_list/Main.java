package basic.two_dimension_array_list;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
         * 2D array list
         */

        ArrayList<ArrayList<String>> groseryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Soda");
        drinkList.add("Coffee");

        groseryList.add(bakeryList);
        groseryList.add(produceList);
        groseryList.add(drinkList);

        System.out.println(groseryList); // show all list
        System.out.println(groseryList.get(0)); // get index 0 from list
        System.out.println(groseryList.get(0).get(0)); // get index 0 from list and index 0 from list

    }
    
}
