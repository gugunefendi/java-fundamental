package contoh_package;

import contoh_package.greetings.Greeting;

public class Main {
    
    public static void main(String[] args) {

        Greeting helloToJava = new Greeting();
        String greeting1 = helloToJava.helloJava();
        System.out.println(greeting1);

        Greeting helloToWorld = new Greeting();
        String greeting2 = helloToWorld.helloWorld();
        System.out.println(greeting2);

        Greeting sayGoodBye = new Greeting();
        String greeting3 = sayGoodBye.goodBye();
        System.out.println(greeting3);
    }

}

// cara menjalankan kode
// compile dengan cara javac contoh_package/greetings/Greeting.java contoh_package/Main.java
// lalu jalankan java contoh_package.Main
