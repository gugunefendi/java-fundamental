package vv_atribute;

public class Main {

    // membuat atribute
    int x;
    final int y = 100;

    public static void main(String[] args) {
        // membuat object
        Main object1 = new Main();

        //akses atribut 
        System.out.println(object1.x);

        // assign value pada atribut
        object1.x = 20;
        System.out.println(object1.x);

        // mengubah value pada atribut
        object1.x = 30;
        System.out.println(object1.x);

        // jika anda ingin atribut tidak dapat diubah gunakan kata kunci 'final'
        // seperti pada atribut y
        
        // object1.y = 99; // // ini akan error
        System.out.println(object1.y);

    }
    
}
