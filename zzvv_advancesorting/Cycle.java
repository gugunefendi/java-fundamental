package zzvv_advancesorting;

public class Cycle implements Comparable<Cycle> {
    
    public String brand;
    public int year;

    public Cycle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public int compareTo(Cycle obj) {
        Cycle other = (Cycle)obj;
        if (year < other.year) return -1;
        if (year > other.year) return 1;
        return 0;
    }

}
