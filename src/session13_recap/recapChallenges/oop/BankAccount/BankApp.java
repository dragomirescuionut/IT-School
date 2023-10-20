package session13_recap.recapChallenges.oop.BankAccount;

import java.util.UUID;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(UUID.randomUUID(), AccountType.SAVINGS, 500, 3.5);
        account1.getAccountInfo();
        account1.deposit(300);
        System.out.println("Balance after depositing $300  : " + account1.getBalance());
        System.out.println("Interest calculated for " + account1.getInterestRate() + " years, is: " + account1.calculateInterest(4));
        account1.withdraw(100);
        System.out.println("Balance after withdrawing $100  : " + account1.getBalance());
    }
}