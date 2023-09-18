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
        int tmp = balance;
        if (balance > 1) {
            do {
                tmp = tmp - 1;
            } while (balance % tmp != 0);
        }
        balance = balance - tmp;
        return tmp;
    }
}
