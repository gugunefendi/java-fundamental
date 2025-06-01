package zzvv_advancesorting;

import java.util.Comparator;

public class SortEvenFirst implements Comparator<Integer> {

    public int compare(Integer obj1, Integer obj2) {
        Integer a = (Integer)obj1;
        Integer b = (Integer)obj2;

        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if (aIsEven == bIsEven) {

            if (a < b) return -1;
            if (a > b) return 1;
            return 0;

        } else {

            if (aIsEven) {
                return -1;
            } else {
                return 1;
            }

        }

    }
    
}
