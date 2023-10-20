package session10_inheritance_and_encapsulation.challenges.bank.account.management.system;

import java.util.UUID;

public class BankAccount {
    private String accountHolderName;
    private UUID accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, UUID accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("The amount of " + amount + " was deposited.");
        } else {
            System.out.println("Invalid amount! ");
        }
    }

    public void withdraw(double amountToWithdraw) {
        if (amountToWithdraw != 0 && amountToWithdraw < balance) {
            balance -= amountToWithdraw;
            System.out.println("The withdrawn amount is: " + amountToWithdraw + ". New balance: " + balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void trasferFunds(BankAccount targetAccount, double amount) {
        if (amount > 0 && amount < balance) {
            targetAccount.deposit(amount);
            System.out.println(amount + " was transfered to: " + targetAccount);
        } else {
            System.out.println("Invalid amount! ");
        }
    }

    public void getAccountDetails() {
        System.out.println("Account holder: " + accountHolderName + " . Account number: " + accountNumber);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        accountNumber = UUID.randomUUID();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
