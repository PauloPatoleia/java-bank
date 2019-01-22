package org.academiadecodigo.bootcamp22.javabank;

public class Person {

    private String name;
    private BankAccount bankAccount;
    private Wallet wallet;

    public Person(String name) {
        this.name = name;
        this.bankAccount = new BankAccount();
        this.wallet = new Wallet();
    }


    public void bankDeposit(double amount) {

        if(wallet.getCurrentAmount() >= amount) {

            walletWithdraw(amount);
            bankAccount.deposit(amount);

        }

    }

    public void bankWithdraw(double amount) {

        if(bankAccount.getCurrentAmount() >= amount) {

            bankAccount.withdraw(amount);
            wallet.deposit(amount);
        }
    }

    public void walletDeposit(double amount) {

        wallet.deposit(amount);

    }

    public void walletWithdraw(double amount) {

        if(wallet.getCurrentAmount() >= amount) {
            wallet.withdraw(amount);
        }
    }

    public void currentFinancialSituation() {
        System.out.println("Amount in the bank: " + bankAccount.getCurrentAmount());
        System.out.println("Amount in the wallet: " + wallet.getCurrentAmount());
    }

}
