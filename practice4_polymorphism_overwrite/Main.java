package practice4_polymorphism_overwrite;

public class Main {

    public static void main(String[] args) {
        Gitar gitar = new Gitar();
        Piano piano = new Piano();

        gitar.bunyi();
        piano.bunyi();
    }
    
}
