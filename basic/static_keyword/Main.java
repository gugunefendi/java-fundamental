package basic.static_keyword;

public class Main {

    public static void main(String[] args) {

        // static = modifieer. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member

        /*
         * Dalam Java, static adalah keyword yang digunakan untuk menunjukkan bahwa suatu variabel, 
         * metode, atau blok kode milik class, bukan objek (instance). 
         * Dengan kata lain, anggota yang memiliki modifier static akan 
         * berbagi nilai yang sama di semua objek dari class tersebut.
         */

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidword");

        System.out.println(Friend.numberOffFriends);

        Friend.totalFriends();

        friend1.displayFriends();
        friend2.displayFriends();
        friend3.displayFriends();

    }
    
}
