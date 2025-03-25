package basic.access_modifiers.private_modifier;

public class Transaction extends BankAccount {

    public void displayTransaction() {
        // System.out.println(this.balance); // error: private modifier can access from subclass
        System.out.println("Your Balance : " + getBalance());
    }
    
}
