package session11_abstraction.challenge.abstract_bank;

public class BankB extends Bank {
    @Override
    public void getBalance() {
        System.out.println("The balance is: $150");
    }
}