package session11_abstraction.challenge.abstract_bank;

public class BankApp {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}