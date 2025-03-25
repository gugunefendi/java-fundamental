package basic.access_modifiers.public_modifiers;

import basic.access_modifiers.package1.Bonus;
import basic.access_modifiers.package1.Salary;
import basic.access_modifiers.private_modifier.BankAccount;

public class Employee {

    public static void main(String[] args) {

        Salary salary = new Salary(); // can use class salary because class modifier is public
        System.out.println(salary.salaryInJanuary); // can use property salary because property modifier is public

        Bonus bonus = new Bonus(); // can use sub class because modifier is public
        System.out.println(bonus.bonusInJanuary); // can use priperty because modifier is public

        System.out.println(bonus.totalSalary()); // can yse method because modifier is public

        BankAccount bankAccount = new BankAccount();
        // System.out.println(bankAccount.name); // error, because property name is private
        // bankAccount.displayName(); // error, because method is private

        // solution: use method public for intermediary (setter and getter)
        bankAccount.setBalance(500000);
        System.out.println("Your Balance : " + bankAccount.getBalance());




    }
    
}
