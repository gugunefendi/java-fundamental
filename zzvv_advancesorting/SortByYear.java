package zzvv_advancesorting;

import java.util.Comparator;

class SortByYear implements Comparator<Car> {

    @Override
    public int compare(Car obj1, Car obj2) {
        Car a = (Car) obj1;
        Car b = (Car) obj2;

        if (a.year < b.year) return -1;
        if (a.year > b.year) return 1;
        return 0;
    }

}