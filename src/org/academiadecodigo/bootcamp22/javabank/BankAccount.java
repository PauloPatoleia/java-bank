package org.academiadecodigo.bootcamp22.javabank;

public class BankAccount {

    private double currentAmount;

    public void deposit(double amount) {
        this.currentAmount += amount;
    }

    public void withdraw(double amount) {
        this.currentAmount -= amount;
    }

    public double getCurrentAmount() {
        return this.currentAmount;
    }
}
