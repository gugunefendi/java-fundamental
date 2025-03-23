package basic.static_keyword;

public class Friend {

    String name;
    static int numberOffFriends;

    Friend(String name) {
        this.name = name;
        numberOffFriends++;
    }

    static void totalFriends() {
        System.out.println("You have " + numberOffFriends + " friends");
    }

    void displayFriends() {
        System.out.println(this.name);
    }
    
}
