package com.tms.Bank;

public class RunnerATM {
    public static void main(String[] args) {
        BankomatATM a = new BankomatATM (10, 10 ,10);
        a.moneyAdd(20);
        a.moneyAdd(100);
        a.moneyAdd(50);

        a.remMoney(400);
        a.remMoney(60);
        a.remMoney(700);



        a.printResult();

    }

}
