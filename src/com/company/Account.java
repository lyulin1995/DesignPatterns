package com.company;

public class Account {
    private float balance;
    // We use private to prevent that other class modify the data.

    // what if we need to change the value of balance?

    public void deposit(float amount) {
        // record the transaction.
        if (amount > 0)
            balance = balance + amount;
        // Or using augmented operator:
        // this.balance += amount;
    }

    public void withdraw (float amount) {
        if (amount > 0)
            balance -= amount;
    }

    // With withdraw and deposit methods, we can get rid of the setter.
    public void setBalance(float balance) {
        // Setter:
        if (balance > 0)
            this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }
}
