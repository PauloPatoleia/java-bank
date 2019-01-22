package org.academiadecodigo.bootcamp22.javabank;

public class Main {

    public static void main(String[] args) {

        Person jimmy = new Person("Jimmy");
        jimmy.walletDeposit(500);
        jimmy.currentFinancialSituation();
        System.out.println("----------------------");
        jimmy.bankDeposit(200);
        jimmy.currentFinancialSituation();
        System.out.println("----------------------");
        jimmy.walletWithdraw(100);
        jimmy.currentFinancialSituation();
        System.out.println("----------------------");
        jimmy.bankWithdraw(100);
        jimmy.currentFinancialSituation();
        System.out.println("----------------------");


    }
}
