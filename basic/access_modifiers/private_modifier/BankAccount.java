package basic.access_modifiers.private_modifier;

public class BankAccount {

    private String name = "Gunawan";
    private float balance;
    
    private void displayName() {
        System.out.println("Name : " + this.name);
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return this.balance;
    }
    
}
