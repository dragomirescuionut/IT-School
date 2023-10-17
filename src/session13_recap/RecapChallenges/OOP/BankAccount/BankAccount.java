package session13_recap.RecapChallenges.OOP.BankAccount;

import java.util.UUID;

public class BankAccount {
    private UUID accountNumber;
    private AccountType accountType;
    private double balance;
    private double interestRate;

    public BankAccount(UUID accountNumber, AccountType accountType, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $: " + amount);
        } else {
            System.out.println("Invalid deposit amount! ");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $:" + amount);
        } else if (amount < 0) {
            System.out.println("Withdrawal amount must be greater than $0");
        } else {
            System.out.println("Insufficient funds! ");
        }
    }
    public void getAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Acoount Type: " + accountType);
        System.out.println("Balance $ : " + balance);
        System.out.println("Interestate rate :" + interestRate + " % ");
    }

    public double calculateInterest(int numberOfYears) {
        return (balance * interestRate * numberOfYears) / 100;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
