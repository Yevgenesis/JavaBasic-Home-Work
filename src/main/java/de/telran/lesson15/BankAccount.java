package de.telran.lesson15;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int withdrawAllowedAmount() {
        int withdraw = balance;
        if (balance > 1) {
            do withdraw = withdraw - 1;
            while (balance % withdraw != 0);
        }
        balance = balance - withdraw;
        return withdraw;
    }

}
