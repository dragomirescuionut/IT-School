package session10_inheritanceAndEncapsulation.challenges.bank.account.management.system;

import java.util.UUID;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", UUID.randomUUID());
        BankAccount account2 = new BankAccount("John", UUID.randomUUID());
        account1.getAccountDetails();
        account2.getAccountDetails();

        System.out.println("Alice's account: ");
        account1.deposit(1000);
        account1.withdraw(100);
        account1.getBalance();

        System.out.println("John's account: ");
        account2.deposit(500);
        account2.withdraw(100);
        account2.getBalance();

        account1.trasferFunds(account2, 100);
        account1.getBalance();
        account2.getBalance();
    }
}
